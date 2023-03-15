package ru.netology;

public class MovieManager {
    private int limit = 5;


    public MovieManager() {

    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    private MovieItem[] movies = new MovieItem[0];

    public void addMovie(MovieItem movie) {
        MovieItem[] tmp = new MovieItem[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MovieItem[] findAll() {
        return movies;
    }

    public MovieItem[] findLast() {
        int resultLength;
        if (movies.length >= limit) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;

    }


}
