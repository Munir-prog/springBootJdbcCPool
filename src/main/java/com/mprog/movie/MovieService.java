package com.mprog.movie;

import com.mprog.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieDao movieDao;

    public List<Movie> getMovies(){
        return movieDao.selectMovies();
    }

    public void addNewMovie(Movie movie) {
        int result = movieDao.insertMovie(movie);
        if (result != 1){
            throw new IllegalStateException("oops something went wrong");
        }
    }

    public void deleteMovie(Integer id){
        Optional<Movie> movies = movieDao.selectMovieById(id);
        movies.ifPresentOrElse(movie -> {
            int result = movieDao.deleteMovie(id);
            if (result != 1) {
                throw new IllegalStateException("oops could not delete movie");
            }
        }, () -> {
            throw new NotFoundException(String.format("Movie with id %s not found", id));
        });
    }

    public Movie getMovie(int id){
        return movieDao.selectMovieById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Movie with id %s not found", id)));
    }

}
