package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void shouldAddFilms() { //добавляет фильмы
        FilmManager films = new FilmManager();
        films.add("Бладшот");
        films.add("Вперёд");
        films.add("Джентльмены");

        String[] expected = {"Бладшот", "Вперёд", "Джентльмены"};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWhereLimitIsLessThanQuantity() { //выводит последние фильмы где лимит меньше количества фильмов
        FilmManager films = new FilmManager(3);
        films.add("Бладшот");
        films.add("Вперёд");
        films.add("Отель Белград");
        films.add("Джентльмены");
        films.add("Человек-невидимка");
        films.add("Тролли.Мировой тур");
        films.add("Номер один");
        films.add("Вызов");
        films.add("Круэлла");

        String[] expected = {"Круэлла", "Вызов", "Номер один"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWhereLimitIsMoreThanQuantity() { //выводит последние фильмы, где лимит больше количества ильмов
        FilmManager films = new FilmManager();
        films.add("Бладшот");
        films.add("Вперёд");
        films.add("Отель Белград");

        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}