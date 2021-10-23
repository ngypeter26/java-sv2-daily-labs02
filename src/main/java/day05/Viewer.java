package day05;

public class Viewer {

    public Movie movie;
    public int rating;

    public void watchMovie(Movie movie, int rating){
       double averageRating= movie.average(rating);
    }

}
