import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

public class Main2 {
    public static void main(String[] args) {
        try {
            InputStream is = new URL("http://ipwhois.app/json/109.235.214.206").openStream();
            BufferedReader reader= new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            StringBuilder text = new StringBuilder();

            int currentByte;
            while ((currentByte = reader.read()) != -1){
                text.append((char) currentByte);
            }
            String jsonStr = text.toString();
            System.out.println(jsonStr);
            JSONObject json = new JSONObject(jsonStr);
            System.out.println("Город в которым Вы находитесь: " + json.get("city"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
