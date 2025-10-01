package DesignSnakeLadder.GameMembers;

import java.util.Queue;

public class Game {

    private final Board board;
    private final Queue<Player> playersLine;
    private Boolean isWinnerChickenDinner;
    private final Dice dice;

    public Game(Board board, Queue<Player> playersLine, Dice dice){
        isWinnerChickenDinner = Boolean.FALSE;
        this.board = board;
        this.playersLine = playersLine;
        this.dice = dice;
    }

    protected void startGame(){
        while (!isWinnerChickenDinner) {
            Player currentPlayer = playersLine.poll();
            dice.rollDice();
            int tempCount = dice.getCurrentRollValue();
            while(dice.getCurrentRollValue()==dice.getMaxValue()){
                dice.rollDice();
                tempCount += dice.getCurrentRollValue();
            }
            assert currentPlayer != null;
            int newPosition = board.getNewPositionOnBoard(currentPlayer.getCurrentPosition(),tempCount);
            if(newPosition==board.getSize()){
                isWinnerChickenDinner = Boolean.TRUE;
                System.out.println("Winner is: " + currentPlayer.getPlayerName());
            }
            currentPlayer.setCurrentPosition(newPosition);
            System.out.println(currentPlayer.getPlayerName() + " has current position as:" + currentPlayer.getCurrentPosition());
            playersLine.add(currentPlayer);
        }
    }


}
