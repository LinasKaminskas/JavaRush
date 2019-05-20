package Tasks3;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class task0303 {


    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        String url_str = "https://api.exchangerate-api.com/v4/latest/EUR";

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
        JsonElement USD = rates.get("USD");

        System.out.println("USD course : " + USD);

//Accessing object
        //String req_result = jsonobj.get("result").getAsString();

        double dollarSum1 = convertEurToUsd(100, USD);
        double dollarSum2 = convertEurToUsd(225, USD);

        System.out.println("$ " + Math.round(dollarSum1 * 100.0) / 100.0 + " \n" + "$ " + Math.round(dollarSum2 * 100.0) / 100.0);
    }

    public static double convertEurToUsd(int eur, JsonElement course) {
        //напишите тут ваш код
        double courses = course.getAsDouble();

        return eur * courses;
    }


}
