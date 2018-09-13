package berlinuhr;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class BerlinUhr {

    /**
     * Return a representation of the Berlinuhr clock, as an array of ints
     * which indicates the number of lights to display on each row of the clock.
     *
     * @param time - string in digital 24-hour time format hh:mm:ss
     * @return array of ints representing the number of lights
     */
    public static int[] fromDigital(String timeString) {
        LocalTime localTime = LocalTime.parse(timeString, DateTimeFormatter.ofPattern("HH:mm:ss"));
        int hour = localTime.get(ChronoField.CLOCK_HOUR_OF_DAY);
        int minute = localTime.get(ChronoField.MINUTE_OF_HOUR);
        int second = localTime.get(ChronoField.SECOND_OF_MINUTE);

        int secondsLight = (second+1) % 2;
        int minorMinutesLight = (minute % 5);
        int majorMinutesLight = (minute / 5);

        return new int[]{secondsLight,majorMinutesLight,minorMinutesLight,0,0};
    }
}
