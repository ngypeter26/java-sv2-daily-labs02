package day04;

public class GasStation {
    private int price;
    private Car car;

    public GasStation(int price) {
        this.price = price;
    }

    public int tanking(Car car,int liter){
        int actualBenzinTank = car.getBenzinTank() + liter;
        car.setBenzinTank (actualBenzinTank);
        int payAmount = liter * price;
        return payAmount;
    }

}
