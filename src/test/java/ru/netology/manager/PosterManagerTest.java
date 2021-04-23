package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    void showDefaultPoster() {
        PosterManager poster = new PosterManager();

        Movie one = new Movie(1, "Гнев человкеческий", "Боевик");
        Movie two = new Movie(2, "Чернобыль", "Драма");
        Movie three = new Movie(3, "Поколение вояджер", "Фантастика");
        Movie four = new Movie(4, "Майор Гром: Чумной доктор", "Боевик");
        Movie five = new Movie(5, "Нечестивые", "Ужасы");
        Movie six = new Movie(6, "Любовь и монстры", "Комедия");
        Movie seven = new Movie(7, "Великий", "Драма");
        Movie eight = new Movie(8, "100% волк", "Мультфильм");
        Movie nine = new Movie(9, "Отец", "Драма");
        Movie ten = new Movie(10, "Пламя парижа", "Музыка");

        poster.add(one);
        poster.add(two);
        poster.add(three);
        poster.add(four);
        poster.add(five);
        poster.add(six);
        poster.add(seven);
        poster.add(eight);
        poster.add(nine);
        poster.add(ten);

        Movie[] actual = poster.showNewMovies();
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six, five, four, three, two, one};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showDefaultPosterManyFilms() {
        PosterManager poster = new PosterManager();

        Movie one = new Movie(1, "Гнев человкеческий", "Боевик");
        Movie two = new Movie(2, "Чернобыль", "Драма");
        Movie three = new Movie(3, "Поколение вояджер", "Фантастика");
        Movie four = new Movie(4, "Майор Гром: Чумной доктор", "Боевик");
        Movie five = new Movie(5, "Нечестивые", "Ужасы");
        Movie six = new Movie(6, "Любовь и монстры", "Комедия");
        Movie seven = new Movie(7, "Великий", "Драма");
        Movie eight = new Movie(8, "100% волк", "Мультфильм");
        Movie nine = new Movie(9, "Отец", "Драма");
        Movie ten = new Movie(10, "Пламя парижа", "Музыка");
        Movie eleven = new Movie(11, "Мортал комбат", "Боевик");

        poster.add(one);
        poster.add(two);
        poster.add(three);
        poster.add(four);
        poster.add(five);
        poster.add(six);
        poster.add(seven);
        poster.add(eight);
        poster.add(nine);
        poster.add(ten);
        poster.add(eleven);

        Movie[] actual = poster.showNewMovies();
        Movie[] expected = new Movie[]{eleven, ten, nine, eight, seven, six, five, four, three, two};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showDefaultPosterFewFilms() {
        PosterManager poster = new PosterManager();

        Movie one = new Movie(1, "Гнев человкеческий", "Боевик");
        Movie two = new Movie(2, "Чернобыль", "Драма");
        Movie three = new Movie(3, "Поколение вояджер", "Фантастика");
        Movie four = new Movie(4, "Майор Гром: Чумной доктор", "Боевик");
        Movie five = new Movie(5, "Нечестивые", "Ужасы");

        poster.add(one);
        poster.add(two);
        poster.add(three);
        poster.add(four);
        poster.add(five);

        Movie[] actual = poster.showNewMovies();
        Movie[] expected = new Movie[]{five, four, three, two, one};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showCustomPoster() {
        PosterManager poster = new PosterManager(5);

        Movie one = new Movie(1, "Гнев человкеческий", "Боевик");
        Movie two = new Movie(2, "Чернобыль", "Драма");
        Movie three = new Movie(3, "Поколение вояджер", "Фантастика");
        Movie four = new Movie(4, "Майор Гром: Чумной доктор", "Боевик");
        Movie five = new Movie(5, "Нечестивые", "Ужасы");
        Movie six = new Movie(6, "Любовь и монстры", "Комедия");
        Movie seven = new Movie(7, "Великий", "Драма");
        Movie eight = new Movie(8, "100% волк", "Мультфильм");
        Movie nine = new Movie(9, "Отец", "Драма");
        Movie ten = new Movie(10, "Пламя парижа", "Музыка");

        poster.add(one);
        poster.add(two);
        poster.add(three);
        poster.add(four);
        poster.add(five);
        poster.add(six);
        poster.add(seven);
        poster.add(eight);
        poster.add(nine);
        poster.add(ten);

        Movie[] actual = poster.showNewMovies();
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six};

        assertArrayEquals(expected, actual);
    }
}