package day02;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first dimension!");

        double aSide = scanner.nextDouble();
        System.out.println("Give the second dimension!");

        double bSide = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(aSide,aSide);

        double area = rectangle.calculateArea(aSide,bSide);
        System.out.println("The area is: " + area );
    }
}
