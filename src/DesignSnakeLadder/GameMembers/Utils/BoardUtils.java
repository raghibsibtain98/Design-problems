package DesignSnakeLadder.GameMembers.Utils;

import DesignSnakeLadder.GameMembers.BoardMembers.Ladder;
import DesignSnakeLadder.GameMembers.BoardMembers.Snake;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class BoardUtils {

    private static final Random random;
    private static final HashSet<Integer> usedSnakeHeads ;

    static {
        random = new Random();
        usedSnakeHeads = new HashSet<>();
    }

    public static List<Snake> generateListOfSnakes(int boardSize,final int numberOfSnakes){
        List<Snake> snakeList = new ArrayList<>();
        int counter = numberOfSnakes;
        while(counter>0){
            int head = random.nextInt(boardSize-2) + 2;
            int tail = random.nextInt(head-1) + 1;

            if(head==boardSize || tail==1){
                continue;
            }
            if(usedSnakeHeads.contains(head)){
                continue;
            }
            usedSnakeHeads.add(head);
            snakeList.add(new Snake(head,tail));
            counter--;
        }
        return snakeList;
    }

    public static List<Ladder> generateListOfLadder(int boardSize,final int numberOfLadders){
        List<Ladder> ladderList = new ArrayList<>();
        int counter = numberOfLadders;
        while(counter>0){
            int start = random.nextInt(boardSize-2) + 1;
            int end = random.nextInt(boardSize-start-1) + (start+1);

            if(start==1 || end>=boardSize){
                continue;
            }
            if(usedSnakeHeads.contains(start)){
                continue;
            }
            usedSnakeHeads.add(start);
            ladderList.add(new Ladder(start,end));
            counter--;
        }
        return ladderList;
    }

}
