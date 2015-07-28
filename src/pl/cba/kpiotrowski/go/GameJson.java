package pl.cba.kpiotrowski.go;

import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


/**
 * Created by sk3 on 2015-07-28.
 */
/*
class GameMessageParser {
    JsonParser parser;

    public GameMessageParser(Reader reader) {
        parser = Json.createParser(reader);
        while(parser.hasNext()) {
            JsonParser.Event event = parser.next();
            switch(event) {

            }
        }
    }
}
*/


public class GameJson extends Game {
    JsonParser jsonParser;

    public GameJson() {
        super();
    }

    public GameJson(int boardSize) {
        super(boardSize);
    }

    public void sendBoardState(Writer out) {
        JsonGenerator gen = Json.createGenerator(out);
        gen.writeStartObject()
                .write("gameId", "0")
                .write("boardState", board.toString())
                .writeEnd();
        gen.close();
    }


}
