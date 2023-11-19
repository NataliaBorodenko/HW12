import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-Невидимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентльмены", "Человек-Невидимка", "Тролли", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLast() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-Невидимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");


        String[] expected = {"Номер один", "Тролли", "Человек-Невидимка"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }
}