package address;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GsonParser {

    public static void createJsonFromString(String fileGson, String s) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        String json = gson.toJson(StringConvert.patternString(s));
        System.out.println(json);
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileGson));
        bw.write(json);
        bw.flush();
        bw.close();
    }
}
