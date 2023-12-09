package app;

import java.util.Random;

public class GetData {
    private final double bet;
    private final int num;

    public GetData(double bet) {
        this.bet = bet;
        this.num = generateRandomNumber();
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public double getBet() {
        return bet;
    }

    public int getNum() {
        return num;
    }
}
