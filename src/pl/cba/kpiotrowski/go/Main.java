package pl.cba.kpiotrowski.go;



import javax.json.Json;
import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Main {

    public static void main(String[] args) {
        GameJson game = new GameJson(8);
        game.move(0, 3, 3);
        game.move(1, 7, 7);
        game.board.displayBoard();

        StringWriter writer = new StringWriter();
        game.sendBoardState(writer);
        System.out.println(writer);

        JsonObject json = Json.createObjectBuilder()
                .add("msg", "move").build();
        JsonMessageHandler handler = new JsonMessageHandler();
        handler.parseJson(json);
    }
}
