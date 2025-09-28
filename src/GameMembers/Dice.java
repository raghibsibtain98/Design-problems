package GameMembers;

import java.util.Random;

public class Dice {

    private final int maxValue;
    private final int minValue;
    private int currentRollValue;
    private Random random;

    public Dice(int maxValue, int minValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.currentRollValue = 0;
        random = new Random();
    }

    public void rollDice(){
         this.currentRollValue = random.nextInt(this.maxValue-this.minValue+1) + this.minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getCurrentRollValue() {
        return currentRollValue;
    }
}
