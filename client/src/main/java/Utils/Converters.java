package Utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Converters {
    public static Date stringToDate(String s) throws ParseException {
        return new SimpleDateFormat("dd-MM-yyy HH:mm:ss").parse(s);
    }
}
