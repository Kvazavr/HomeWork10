package ru.netology;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieItem movieItem1 = new MovieItem("Whiplash");
    MovieItem movieItem2 = new MovieItem("Dogville");
    MovieItem movieItem3 = new MovieItem("Monderlay");
    MovieItem movieItem4 = new MovieItem("Star Wars: The Clone Wars");
    MovieItem movieItem5 = new MovieItem("Star Wars: Episode I");
    MovieItem movieItem6 = new MovieItem("Game of Thrones");

    MovieManager movieManager = new MovieManager();

    @Test
    public void shouldAddMovie() {
        movieManager.addMovie(movieItem1);
        MovieItem[] expected = new MovieItem[]{movieItem1};
        MovieItem[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowAllMovies() {
        movieManager.addMovie(movieItem1);
        movieManager.addMovie(movieItem2);
        movieManager.addMovie(movieItem3);
        MovieItem[] expected = new MovieItem[]{movieItem1, movieItem2, movieItem3};
        MovieItem[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShow5LastMovies() {
        movieManager.addMovie(movieItem1);
        movieManager.addMovie(movieItem2);
        movieManager.addMovie(movieItem3);
        movieManager.addMovie(movieItem4);
        movieManager.addMovie(movieItem5);
        movieManager.addMovie(movieItem6);
        MovieItem[] expected = new MovieItem[]{movieItem6, movieItem5, movieItem4, movieItem3, movieItem2};
        MovieItem[] actual = movieManager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowSomeLastMovies() {
        MovieManager movieManager1 = new MovieManager(3);
        movieManager1.addMovie(movieItem1);
        movieManager1.addMovie(movieItem2);
        movieManager1.addMovie(movieItem3);
        movieManager1.addMovie(movieItem4);
        movieManager1.addMovie(movieItem5);
        movieManager1.addMovie(movieItem6);
        MovieItem[] expected = new MovieItem[]{movieItem6, movieItem5, movieItem4};
        MovieItem[] actual = movieManager1.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldShowLastMoviesWhenLimitMoreLength() {
        MovieManager movieManager1 = new MovieManager(5);
        movieManager1.addMovie(movieItem1);
        movieManager1.addMovie(movieItem2);
        movieManager1.addMovie(movieItem3);
        MovieItem[] expected = new MovieItem[]{movieItem3, movieItem2, movieItem1};
        MovieItem[] actual = movieManager1.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}
