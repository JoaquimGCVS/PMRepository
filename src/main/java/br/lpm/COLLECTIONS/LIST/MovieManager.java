package br.lpm.COLLECTIONS.LIST;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    private final List<Movie> movies;
    public MovieManager() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }
    public List<Movie> getMovies() {
        return movies;
    }
    public void getAll() {
        movies.forEach(System.out::println); // expressao lambda
    }
    public Movie getMovieByName(String name) {
        for (Movie movie:movies) {
            if (movie.getName().equalsIgnoreCase(name)) {
                return movie;
            }
        }
        throw new RuntimeException("Error: invalid name");
    }
    public Movie getMovieByIndex(int index) {
        if(index>=0 && index<= movies.size()-1) { // o size nao conta o index 0, por isso tem uma posicao acima
            return movies.get(index);
        }
        else {
            throw new RuntimeException("Error: Invalid index");
        }
    }
}
