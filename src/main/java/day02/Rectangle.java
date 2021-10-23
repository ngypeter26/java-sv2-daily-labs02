package day02;

public class Rectangle {
    private double aSide;
    private double bSide;
    public double area;

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.area = aSide*bSide;
    }

    public double calculateArea(double aSide, double bSide){
        return area = aSide*bSide;
    }
}
