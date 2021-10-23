package day05;

import day05.Movie;
import day05.Viewer;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Harry Potter",1970);
        Viewer viewer = new Viewer();

        viewer.watchMovie(movie,2);
        viewer.watchMovie(movie,3);
        viewer.watchMovie(movie,5);


        System.out.println(movie.getAverageRating());
        System.out.println(movie.getNumberOfRatings());
        System.out.println(movie.getSumOfRatings());
    }
}
