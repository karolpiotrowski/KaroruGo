package pl.cba.kpiotrowski.go;

/**
 * Created by sk3 on 2015-07-28.
 */

public class Game {
    Board board;
    Player[] players;
    Color[] playerColor;

    public Game() {
        players = new Player[2];
        playerColor = new Color[2];
        playerColor[0] = Color.WHITE;
        playerColor[1] = Color.BLACK;
    }

    public Game(int boardSize) {
        this();
        board = new Board(boardSize);
    }

    public void move(int playerNo, int x, int y) {
        if(board.isEmpty(x, y)) {
            board.setStoneAt(x, y, playerColor[playerNo]);
        }
    }

    public int[] getPlayerIds() {
        int[] playerIds = new int[2];
        for(int i = 0; i < 2; ++i) {
            playerIds[i] = players[i].getPlayerId();
        }
        return playerIds;
    }
}
