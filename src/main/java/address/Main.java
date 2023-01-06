package address;

import java.io.IOException;

/**
 * Створити рядок у форматі JSON (наприклад): Країна: Україна, місто: Київ, вулиця: Хрещатик.
 * Рядок обробити і записати в JSON файл, використовуючи Jackson та Gson бібліотеки.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        String fileJackson = "src/main/resources/addressJackson.json";
        String fileGson = "src/main/resources/addressGson.json";
        JacksonParser.createJsonFromString(fileJackson, "Країна: Україна, місто: Харків, вулиця: Льва Ландау");
        GsonParser.createJsonFromString(fileGson, "Країна: Україна, місто: Мукачево, вулиця: Духновича");
    }
}
