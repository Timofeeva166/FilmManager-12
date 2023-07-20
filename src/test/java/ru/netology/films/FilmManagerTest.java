package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmManager item1 = new FilmManager("Бладшот", "боевик");
    FilmManager item2 = new FilmManager("Вперёд", "мультфильм");
    FilmManager item3 = new FilmManager("Отель ''Белград''", "комедия");
    FilmManager item4 = new FilmManager("Джентльмены", "боевик");
    FilmManager item5 = new FilmManager("Человек-невидимка", "ужасы");
    FilmManager item6 = new FilmManager("Тролли.мировой тур", "мультфильм");
    FilmManager item7 = new FilmManager("Номер один", "комедия");

    @Test
    public void shouldAddFilms() { //тест на добавление фильмов в ленту
        FilmManager items = new FilmManager();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);

        FilmManager[] expected = {item1, item2, item3, item4, item5, item6, item7};
        FilmManager[] actual = items.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowNewestBelowSeven() { //выводит новые при выставлении меньше 7
        FilmManager items = new FilmManager(4);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);

        FilmManager[] expected = {item7, item6, item5, item4};
        FilmManager[] actual = items.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowNewestAboveSeven() { //выводит новые при выставлении больше 7
        FilmManager items = new FilmManager(9);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);

        FilmManager[] expected = {item7, item6, item5, item4, item3, item2, item1};
        FilmManager[] actual = items.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
