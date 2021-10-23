package day04;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        GasStation gasStation = new GasStation(450);

        System.out.println("Actual km: " + car.getKm() + "\n" +
                            "Actual benzin: " + car.getBenzinTank());

        // első tankolás
        int actualPayamount= gasStation.tanking(car,20);
        System.out.println("Actual km: " + car.getKm() + "\n" +
                "Actual benzin: " + car.getBenzinTank() + "\n" +
                "Actual pay amount: " + actualPayamount);
        // első út
        car.setKm(car.getKm()+250);
        car.setBenzinTank(car.getBenzinTank()-15);
        double actaulConsumtion = car.calculateConsumtion();
        System.out.println("Actual km: " + car.getKm() + "\n" +
                "Actual benzin: " + car.getBenzinTank() + "\n" +
                "Actual average consumtion: " + actaulConsumtion);

        // második tankolás
        actualPayamount= gasStation.tanking(car,40);
        System.out.println("Actual km: " + car.getKm() + "\n" +
                "Actual benzin: " + car.getBenzinTank() + "\n" +
                "Actual pay amount: " + actualPayamount);
        // második út
        car.setKm(car.getKm()+300);
        car.setBenzinTank(car.getBenzinTank()-24);
        System.out.println("Actual km: " + car.getKm() + "\n" +
                "Actual benzin: " + car.getBenzinTank() + "\n" +
                "Actual average consumtion: " + car.calculateConsumtion());





    }




}
