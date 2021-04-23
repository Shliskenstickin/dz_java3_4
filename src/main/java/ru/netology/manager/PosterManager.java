package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

@NoArgsConstructor
public class PosterManager {
    private int posterLength = 10;

    private Movie[] movies = new Movie[0];

    public PosterManager(int posterLength) {
        this.posterLength = posterLength;
    }

    public void add(Movie movie) {
        // создаём новый массив размером на единицу больше
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        // копируем поэлементно
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] showNewMovies() {
        int count = posterLength;
        if (movies.length < count) count = movies.length;
        Movie[] result = new Movie[count];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < count; i++) {
            int index = movies.length - 1 - i;
            result[i] = movies[index];
        }
        return result;
    }
}
