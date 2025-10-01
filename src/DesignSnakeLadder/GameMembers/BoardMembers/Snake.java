package DesignSnakeLadder.GameMembers.BoardMembers;

public class Snake implements Cell{

    int startPosition;
    int endPosition;

    public Snake(int startPosition, int endPosition){
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
