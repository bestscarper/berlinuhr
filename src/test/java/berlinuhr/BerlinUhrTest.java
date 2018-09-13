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
        assertArrayEquals("seconds edge case", BerlinUhr.fromDigital("00:00:58"), new int[]{1,0,0,0,0});
        assertArrayEquals("seconds edge case", BerlinUhr.fromDigital("00:00:59"), new int[]{0,0,0,0,0});
    }

    @Ignore
    @Test
    public void acceptance() {
        assertArrayEquals(BerlinUhr.fromDigital("10:31:00"), new int[]{1,2,0,6,1});
    }


    //@Test
    // reject invalid time format
}