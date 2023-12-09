package app;

public class Win3 extends Game{
    @Override
    public double calculateWin(double bet, int num) {
        if(num > 7){
            return 2 * bet - 0.1 * (2 * bet);
        }
        return super.calculateWin(bet, num);
    }
}
