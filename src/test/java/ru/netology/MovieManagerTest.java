package ru.netology;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieItem movieItem1 = new MovieItem("Неуловимые");

    @Test
    public void shouldAddMovie() {
        MovieManager movieItem = new MovieManager();
        movieItem.addMovie(movieItem1);
        MovieItem[] expected = {movieItem1};
        MovieItem[] actual = movieItem.getMovies;
        Assertion.assertArrayEquals(expected, actual);


    }


}
