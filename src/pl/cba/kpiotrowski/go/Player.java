package pl.cba.kpiotrowski.go;

/**
 * Created by sk3 on 2015-07-28.
 */
public class Player {
    public Player(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    int playerId;

}
