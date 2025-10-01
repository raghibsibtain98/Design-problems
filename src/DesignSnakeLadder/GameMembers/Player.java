package DesignSnakeLadder.GameMembers;

public class Player {

    private int currentPosition;
    private final String playerName;

    public Player(String playerName){
        this.currentPosition = 0;
        this.playerName = playerName;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getPlayerName() {
        return playerName;
    }
}
