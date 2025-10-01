package DesignSnakeLadder.GameMembers;

import DesignSnakeLadder.GameMembers.Utils.BoardUtils;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(100, BoardUtils.generateListOfSnakes(100,5),BoardUtils.generateListOfLadder(100,6));
        Queue<Player> playerQueue = new LinkedList<>();
        playerQueue.add(new Player("ABC"));
        playerQueue.add(new Player("DEF"));
        playerQueue.add(new Player("XYZ"));
        Game game = new Game(board,playerQueue,new Dice(6,1));
        game.startGame();
    }
}