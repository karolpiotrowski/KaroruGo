package pl.cba.kpiotrowski.go;

import javax.json.JsonObject;

/**
 * Created by sk3 on 2015-07-28.
 */
public class JsonMessageHandler {
    public void parseJson(JsonObject json) {
        String msg;
        try {
            msg = json.getString("msg");
        } catch(NullPointerException e) {
            System.err.println("Niewlasciwy komunnikat.");
            return;
        }
        System.err.println("Komunikat typu: " + msg);
    }
}
