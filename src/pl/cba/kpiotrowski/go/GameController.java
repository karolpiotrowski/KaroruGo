package pl.cba.kpiotrowski.go;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sk3 on 2015-07-28.
 */
public class GameController {
    HashMap<Integer, Game> currentGames;

    /**
     *  @warning Watki?!?!
     */
    Queue<ServerMessage> serverMessageQueue;

    public GameController() {
        serverMessageQueue = new LinkedList<ServerMessage>();
    }

    public void parseMessage(Message msg) {
        if(msg instanceof MoveMessage)) {
            MoveMessage moveMsg = (MoveMessage) msg;
            int gameId = moveMsg.getGameId();
            int x = moveMsg.getX();
            int y = moveMsg.getY();
            int playerId = moveMsg.getPlayerId();
            if(currentGames.containsKey(gameId)) {
                currentGames.get(gameId).move(playerId, x, y);
            }

            serverMessageQueue.add(new )
            System.err.println("Gracz " + playerId + " wykonuje ruch na " + x + " " + y);

        }
        System.err.println("Invalid message!");
    }

    public Queue<ServerMessage> getServerMessageQueue() {
        return serverMessageQueue;
    }
}

