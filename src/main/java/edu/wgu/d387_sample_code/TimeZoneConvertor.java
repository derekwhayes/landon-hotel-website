package edu.wgu.d387_sample_code;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TimeZoneConvertor {

    public ArrayList<String> convertTimeZones() {

        ArrayList<String> times = new ArrayList<>();

        ZoneId zEastern =  ZoneId.of("America/New_York");
        ZoneId zMountain = ZoneId.of("America/Denver");
        ZoneId zUTC = ZoneId.of("UTC");
        ZoneId zoneId = ZoneId.systemDefault();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a zzz");


        LocalDateTime localDateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);

        ZonedDateTime zonedDateTimeEastern = zonedDateTime.withZoneSameInstant(zEastern);
        //LocalDateTime localDateTimeEastern = zonedDateTimeEastern.toLocalDateTime();
        String formattedTimeEastern = zonedDateTimeEastern.format(formatter);
        times.add(formattedTimeEastern);

        ZonedDateTime zonedDateTimeMountain = zonedDateTime.withZoneSameInstant(zMountain);
        //LocalDateTime localDateTimeMountain = zonedDateTimeMountain.toLocalDateTime();
        String formattedTimeMountain = zonedDateTimeMountain.format(formatter);
        times.add(formattedTimeMountain);

        ZonedDateTime zonedDateTimeUTC = zonedDateTime.withZoneSameInstant(zUTC);
        //LocalDateTime localDateTimeUTC = zonedDateTimeUTC.toLocalDateTime();
        String formattedTimeUTC = zonedDateTimeUTC.format(formatter);
        times.add(formattedTimeUTC);

        return times;
    }

}
