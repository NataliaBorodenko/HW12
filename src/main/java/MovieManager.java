
public class MovieManager {

    private ListMovie[] movies = new ListMovie[0];
    private int limit;

    public MovieManager() {
        limit = 5;

    }

    public MovieManager(int limit) {
        this.limit = limit;

    }

    public void addMovie(ListMovie movie) {
        ListMovie[] tmp = new ListMovie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public ListMovie[] findAll() {
        return movies;
    }

    public ListMovie[] findLast() {
        ListMovie[] movies = findAll();
        ListMovie[] resultLength;

        if (limit < movies.length) {
            resultLength = new ListMovie[limit];
        } else {
            resultLength = new ListMovie[movies.length];
        }

        for (int i = 0; i < movies.length; i++) {
            resultLength[i] = movies[movies.length - 1 - i];
        }
        return resultLength;
    }
}



