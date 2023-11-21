public class Main {
    public static void main(String[] args) {
        ListMovie film1 = new ListMovie(1, "Бладшот");
        ListMovie film2 = new ListMovie(2, "Вперёд");
        ListMovie film3 = new ListMovie(3, "Отель Белград");
        ListMovie film4 = new ListMovie(4, "Джентльмены");
        ListMovie film5 = new ListMovie(5, "Человек-Невидимка");
        ListMovie film6 = new ListMovie(6, "Тролли");
        ListMovie film7 = new ListMovie(7, "Номер один");

        MovieManager manager = new MovieManager();
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);
        manager.addMovie(film7);

        ListMovie[] all = manager.findLast();
    }
}
