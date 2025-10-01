package DesignSnakeLadder.GameMembers.BoardMembers;

public class Ladder implements Cell{
    int startPosition;
    int endPosition;

    public Ladder(int startPosition, int endPosition){
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }
}
