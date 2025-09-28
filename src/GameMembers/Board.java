package GameMembers;

import GameMembers.BoardMembers.Ladder;
import GameMembers.BoardMembers.Snake;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    private final int size;
    private final Map<Integer,Snake> snakeMap;
    private final Map<Integer,Ladder> ladderMap;

    public Board(int size, List<Snake> snakeList, List<Ladder> ladderList) {
        this.size = size;
        snakeMap = new HashMap<>();
        ladderMap = new HashMap<>();
        for(Snake snake: snakeList){
            snakeMap.put(snake.getStartPosition(),snake);
        }
        for(Ladder ladder: ladderList){
            ladderMap.put(ladder.getStartPosition(),ladder);
        }
    }

    public int getNewPositionOnBoard(int currentPosition, int diceRollCount){
        final int tempPosition = currentPosition + diceRollCount;
        int finalPosition = tempPosition;
        if(snakeMap.containsKey(tempPosition)){
            finalPosition = snakeMap.get(tempPosition).getEndPosition();
        }
        if(ladderMap.containsKey(tempPosition)){
            finalPosition = ladderMap.get(tempPosition).getEndPosition();
        }
        if(finalPosition>getSize()){
            return currentPosition;
        }
        return finalPosition;
    }
    public int getSize() {
        return this.size;
    }
}
