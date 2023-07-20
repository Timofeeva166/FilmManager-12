package ru.netology.films;

public class FilmManager {
    private String name; //имя
    private String genre; //жанр
    private FilmManager[] items = new FilmManager[0];
    private int limit = 5; //лимит по дефолту
    private int resultLength;

    public FilmManager(String name, String genre) {//принимает название и жанр
        this.name = name;
        this.genre = genre;
    }

    public FilmManager() {
        resultLength = limit;
    }

    public FilmManager(int limit) {
        if (limit < 7) {
            resultLength = limit;
        } else {
            resultLength = 7;
        }
    }

    public void add(FilmManager newItem) { //добавить новый фильм
        FilmManager[] tmp = new FilmManager[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = newItem;
        items = tmp;
    }

    public FilmManager[] findLast() { //вывод лимит фильмов
        FilmManager[] all = items;
        FilmManager[] result = new FilmManager[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }

    public FilmManager[] findAll() { //вывод в порядке добавления
        return items;
    }

}

