package com.ps.assignment3.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Converters {
    public static String DateToString(Timestamp t){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
        return dateFormat.format(t);
    }
}
