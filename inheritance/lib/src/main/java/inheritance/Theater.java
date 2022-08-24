package inheritance;

import java.util.ArrayList;


public class Theater {
    public String name;
    public String movieTitle;
    public ArrayList<Movie> movie = new ArrayList<>();

    public Theater(String name, String movieTitle) {
        this.name = name;
        this.movieTitle = movieTitle;
    }

    public void addMovie (String movieTitle){
        this.movie.add(movieTitle);
    }

    public void removeMovie(String movieTitle){
        this.movies.remove(movieTitle);
    }
}