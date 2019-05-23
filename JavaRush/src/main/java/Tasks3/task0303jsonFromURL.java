package Tasks3;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Task0303jsonFromURL {


    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        String url_str = "https://api.exchangerate-api.com/v4/latest/GBP";

// Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

// Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();


//Istraukiu is Json
        JsonObject rates = jsonobj.getAsJsonObject("rates");
        JsonElement EUR = rates.get("EUR");

        System.out.println("GBP to EUR : " + EUR);

//Accessing object
        //String req_result = jsonobj.get("result").getAsString();

        double euroSum1 = convertGbpToEur(100, EUR);
        double euroSum2 = convertGbpToEur(225, EUR);

        System.out.println("\u20ac " + Math.round(euroSum1 * 100.0) / 100.0 + " \n" + "\u20ac " + Math.round(euroSum2 * 100.0) / 100.0);
    }

    public static double convertGbpToEur(int gbp, JsonElement course) {
        //напишите тут ваш код
        double courses = course.getAsDouble();

        return gbp* courses;
    }


}
