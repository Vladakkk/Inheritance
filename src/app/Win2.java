package app;

public class Win2 extends Game {
    public double calculateWin(double bet, int num) {
        if(num >= 3 && num <= 7){
            return 1.25 * bet - 0.05 * bet;
        }
        return super.calculateWin(bet, num);
    }
}
