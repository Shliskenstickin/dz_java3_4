package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Movie;
import ru.netology.repository.PosterRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class PosterManagerTest {
    @Mock
    private PosterRepository repository;

    @InjectMocks
    private PosterManager poster;

    private Movie one = new Movie(1, "Гнев человкеческий", "Боевик");
    private Movie two = new Movie(2, "Чернобыль", "Драма");
    private Movie three = new Movie(3, "Поколение вояджер", "Фантастика");
    private Movie four = new Movie(4, "Майор Гром: Чумной доктор", "Боевик");
    private Movie five = new Movie(5, "Нечестивые", "Ужасы");
    private Movie six = new Movie(6, "Любовь и монстры", "Комедия");
    private Movie seven = new Movie(7, "Великий", "Драма");
    private Movie eight = new Movie(8, "100% волк", "Мультфильм");
    private Movie nine = new Movie(9, "Отец", "Драма");
    private Movie ten = new Movie(10, "Пламя парижа", "Музыка");
    private Movie eleven = new Movie(11, "Мортал комбат", "Боевик");

    @Test
    void showDefaultPoster() {
        Movie[] returned = new Movie[]{one, two, three, four, five, six, seven, eight, nine, ten};
        doReturn(returned).when(repository).findAll();

        Movie[] actual = poster.showNewMovies();
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six, five, four, three, two, one};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showDefaultPosterManyFilms() {
        Movie[] returned = new Movie[]{one, two, three, four, five, six, seven, eight, nine, ten, eleven};
        doReturn(returned).when(repository).findAll();

        Movie[] actual = poster.showNewMovies();
        Movie[] expected = new Movie[]{eleven, ten, nine, eight, seven, six, five, four, three, two};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showDefaultPosterFewFilms() {
        Movie[] returned = new Movie[]{one, two, three, four, five};
        doReturn(returned).when(repository).findAll();

        Movie[] actual = poster.showNewMovies();
        Movie[] expected = new Movie[]{five, four, three, two, one};

        assertArrayEquals(expected, actual);
    }
}