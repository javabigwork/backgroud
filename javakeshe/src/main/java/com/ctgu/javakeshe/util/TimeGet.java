package com.ctgu.javakeshe.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeGet {
    public static String timeget(){
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String time=dateFormat.format(new Date());
        return time;
    }
}
