package app;

    public class Win1 extends Game{
        @Override
        public double calculateWin(double bet, int num) {
            if(num < 3){
                return 1.25 * bet;
            }
            return super.calculateWin(bet, num);
        }
    }

