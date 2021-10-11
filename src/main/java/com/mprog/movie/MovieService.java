package com.mprog.movie;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
