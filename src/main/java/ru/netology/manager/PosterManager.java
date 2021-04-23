package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;
import ru.netology.repository.PosterRepository;

@NoArgsConstructor
public class PosterManager {
    private int posterLength = 10;

    private PosterRepository repository;

    public PosterManager(PosterRepository repository) {
        this.repository = repository;
    }

    public PosterManager(int posterLength, PosterRepository repository) {
        this.posterLength = posterLength;
        this.repository = repository;
    }

    public void add(Movie movie) {
        repository.save(movie);
    }

    public Movie[] showNewMovies() {
        Movie[] movies = repository.findAll();
        if (movies.length < posterLength) posterLength = movies.length;
        Movie[] result = new Movie[posterLength];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < posterLength; i++) {
            int index = movies.length - 1 - i;
            result[i] = movies[index];
        }
        return result;
    }
}
