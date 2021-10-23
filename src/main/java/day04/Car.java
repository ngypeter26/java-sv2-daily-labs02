package day04;

public class Car {
    private int benzinTank;
    private int km;
    private double consumtion;
    private double goneKm;

    public double calculateConsumtion() {
        double averageConsumtion = consumtion / goneKm *100.0;
//        System.out.println(consumtion);
//        System.out.println(goneKm);
//        System.out.println(averageConsumtion);
        return averageConsumtion;
    }

    public void setBenzinTank(int benzinTank) {
        consumtion = this.benzinTank - benzinTank;
        this.benzinTank = benzinTank;
    }

    public void setKm(int km) {
        goneKm = km - this.km  ;
        this.km = km;
    }

    public int getBenzinTank() {

        return benzinTank;
    }

    public int getKm() {
        return km;
    }

    public double getConsumtion() {
        return consumtion;
    }

    public double getGoneKm() {
        return goneKm;
    }
}
