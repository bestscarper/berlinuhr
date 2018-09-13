package berlinuhr;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BerlinUhrTest {

    @Test
    public void midnight() {
        assertArrayEquals(BerlinUhr.fromDigital("00:00:00"), new int[]{1,0,0,0,0});
    }

    @Test
    public void oneSecondsPastMidnight() {
        assertArrayEquals(BerlinUhr.fromDigital("00:00:01"), new int[]{0,0,0,0,0});
    }


    //@Test
    // reject invalid time format
}