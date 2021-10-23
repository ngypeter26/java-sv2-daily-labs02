package day05;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int date;
    private double averageRating;
    private int numberOfRatings;
    private int sumOfRatings;

    private List<Integer> ratings = new ArrayList<>();

    public Movie(String title, int date) {
        this.title = title;
        this.date = date;
    }
    public double rateMovie(int rating){
        ratings.add(rating);
        averageRating = calculateAvg();
        return averageRating;
    }

    private double calculateAvg(){
        double sum=0;
        for (int i=0;i<ratings.size();i++){
            sum+=ratings.get(i);
        }
        return sum/ratings.size();
    }

    public double average(int actualrating){
       // sumOfRatings = sumOfRatings + actualrating;
        sumOfRatings +=  actualrating;
       // numberOfRatings = numberOfRatings + 1;
        numberOfRatings ++;
        averageRating = (sumOfRatings*1.0) / numberOfRatings;
        return averageRating;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public int getSumOfRatings() {
        return sumOfRatings;
    }
}
