package berlinuhr;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BerlinUhrTest {

    @Test
    public void midnight() {
        assertArrayEquals(BerlinUhr.fromDigital("00:00:00"), new int[]{1,0,0,0,0});
    }

    @Test
    public void seconds() {
        assertArrayEquals("one second", BerlinUhr.fromDigital(  "00:00:01"), new int[]{1,0,0,0,0});
        assertArrayEquals("two seconds", BerlinUhr.fromDigital(  "00:00:02"), new int[]{0,0,0,0,0});
        assertArrayEquals("58 seconds edge case", BerlinUhr.fromDigital("00:00:58"), new int[]{1,0,0,0,0});
        assertArrayEquals("59 seconds edge case", BerlinUhr.fromDigital("00:00:59"), new int[]{0,0,0,0,0});
    }

    @Test
    public void minutes() {
        assertArrayEquals("one minute", BerlinUhr.fromDigital("00:01:01"), new int[]{0,0,0,0,1});
        assertArrayEquals("four minutes", BerlinUhr.fromDigital("00:04:01"), new int[]{0,0,0,0,4});
        assertArrayEquals("five minutes", BerlinUhr.fromDigital("00:05:01"), new int[]{0,0,0,1,0});
        assertArrayEquals("six minutes", BerlinUhr.fromDigital("00:06:01"), new int[]{0,0,0,1,1});
        assertArrayEquals("eleven minutes", BerlinUhr.fromDigital("00:11:01"), new int[]{0,0,0,2,1});
        assertArrayEquals("fifty-nine minutes", BerlinUhr.fromDigital("00:59:01"), new int[]{0,0,0,11,4});
    }

    @Ignore
    @Test
    public void acceptance() {
        assertArrayEquals(BerlinUhr.fromDigital("10:31:00"), new int[]{1,2,0,6,1});
    }


    //@Test
    // reject invalid time format
}