import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    ListMovie film1 = new ListMovie(1, "Бладшот");
    ListMovie film2 = new ListMovie(2, "Вперёд");
    ListMovie film3 = new ListMovie(3, "Отель Белград");
    ListMovie film4 = new ListMovie(4, "Джентльмены");
    ListMovie film5 = new ListMovie(5, "Человек-Невидимка");
    ListMovie film6 = new ListMovie(6, "Тролли");
    ListMovie film7 = new ListMovie(7, "Номер один");

    @Test
    public void test() {
        MovieManager manager = new MovieManager();
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);
        manager.addMovie(film7);

        ListMovie[] expected = {film1, film2, film3, film4, film5, film6, film7};
        ListMovie[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLast() {
        MovieManager manager = new MovieManager();
        manager.addMovie(film1);

        ListMovie[] expected = {film1};
        ListMovie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast2() {
        MovieManager manager = new MovieManager();
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);

        ListMovie[] expected = {film4, film3, film2, film1};
        ListMovie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast3() {
        MovieManager manager = new MovieManager();
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);

        ListMovie[] expected = {film6, film5, film4, film3, film2};
        ListMovie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast4() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);
        manager.addMovie(film7);

        ListMovie[] expected = {film7, film6, film5, film4, film3, film2, film1};
        ListMovie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5() {
        MovieManager manager = new MovieManager(4);
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);
        manager.addMovie(film7);

        ListMovie[] expected = {film7, film6, film5, film4};
        ListMovie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast6() {
        MovieManager manager = new MovieManager();

        ListMovie[] expected = {};
        ListMovie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}