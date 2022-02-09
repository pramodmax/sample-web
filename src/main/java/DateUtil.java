package main.java;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {
    public static void main(String[] args) {
        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date = new Date();
        ZonedDateTime zdt = ZonedDateTime.now();
        String zdtString = FOMATTER.format(zdt);


        System.out.println("event date:" + zdtString);


    }
}
