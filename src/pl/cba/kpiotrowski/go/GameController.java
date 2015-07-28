package pl.cba.kpiotrowski.go;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sk3 on 2015-07-28.
 */
public class GameController {
    HashMap<Integer, Game> currentGames;
    public void parseMessage(Message msg) {
        if(msg instanceof MoveMessage)) {
            MoveMessage moveMsg = (MoveMessage) msg;
            int gameId = moveMsg.getGameId();
            int x = moveMsg.getX();
            int y = moveMsg.getY();
            int playerId = moveMsg.getPlayerId();
            Color color = moveMsg.getColor();
            if(currentGames.containsKey(gameId)) {
                currentGames.get(gameId).move(playerId, x, y);
            }
            System.err.println("Gracz " + playerId + " wykonuje ruch na " + x + " " + y);
            }
        };

        System.err.println("Invalid message!");
    }
}

