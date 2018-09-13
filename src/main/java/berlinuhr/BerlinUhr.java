package berlinuhr;

public class BerlinUhr {

    /**
     * Return a representation of the Berlinuhr clock, as an array of ints
     * which indicates the number of lights to display on each row of the clock.
     *
     * @param time - string in digital 24-hour time format hh:mm:ss
     * @return array of ints representing the number of lights
     */
    public static int[] fromDigital(String time) {
        return new int[]{1,0,0,0,0};
    }
}
