package address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringConvert {
    public static Address patternString(String s) {
        Pattern pattern = Pattern.compile("(.+):\\s?(.+),\\s?(.+):\\s?(.+),\\s?(.+):\\s?(.+)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(s);
        matcher.find();
        String countryName = matcher.group(2);
        String cityName = matcher.group(4);
        String streetName = matcher.group(6);
        return new Address(countryName,cityName,streetName);
    }
}
