package pl.cba.kpiotrowski.go;

import java.io.Serializable;

/**
 * Created by sk3 on 2015-07-28.
 */

public class Message implements Serializable {

}

class ClientMessage extends Message {

}

class MoveMessage extends Message {
    public MoveMessage(int playerId, int x, int y, int gameId) {
        this.playerId = playerId;
        this.x = x;
        this.y = y;
        //this.color = color;
        this.gameId = gameId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    int gameId;

    public int getGameId() {
        return gameId;
    }

    int playerId;
    int x, y;
    Color color;
}

class ServerMessage extends Message {

}

