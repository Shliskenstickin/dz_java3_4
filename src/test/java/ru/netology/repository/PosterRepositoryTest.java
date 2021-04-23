package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class PosterRepositoryTest {
    PosterRepository repository = new PosterRepository();

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

    @BeforeEach
    public void setUp() {
        repository.save(one);
        repository.save(two);
        repository.save(three);
        repository.save(four);
        repository.save(five);
        repository.save(six);
        repository.save(seven);
        repository.save(eight);
        repository.save(nine);
        repository.save(ten);
        repository.save(eleven);
    }

    @Test
    void removeById() {
        repository.removeById(9);

        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[]{one, two, three, four, five, six, seven, eight, ten, eleven};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeAll() {
        repository.removeAll();

        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    void findById() {
        Movie actual = repository.findById(9);
        Movie expected = nine;

        assertEquals(expected, actual);
    }
}