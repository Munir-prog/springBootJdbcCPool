package com.mprog.movie;

import java.util.List;
import java.util.Optional;

public class MovieDataAccessService implements MovieDao{
    @Override
    public List<Movie> selectMovies() {
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public int insertMovie(Movie movie) {
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public int deleteMovie(int id) {
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public Optional<Movie> selectMovieById(int id) {
        throw new UnsupportedOperationException("not implemented");
    }
}
