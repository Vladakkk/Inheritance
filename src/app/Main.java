package app;

import java.util.Scanner;

public class Main {

    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your bet: ");
        double bet = scanner.nextDouble();

        GetData data = new GetData(bet);

        Game game;
        if (data.getNum() < 3) {
            game = new Win1();
        } else if (data.getNum() >= 3 && data.getNum() <= 7) {
            game = new Win2();
        } else {
            game = new Win3();
        }

        double win = game.calculateWin(data.getBet(), data.getNum());

        System.out.println("Your number: " + data.getNum());
        System.out.printf("Your bet: " + CURRENCY + " " + "%.2f", data.getBet());
        System.out.printf("\nYour win: " + CURRENCY + " " + "%.2f", win);
    }
}
