package berlinuhr;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.DateTimeException;

import static org.junit.Assert.assertArrayEquals;

public class ParserTest {

    @Test
    public void midnight() {
        assertArrayEquals(Parser.fromDigital("00:00:00"), new int[]{1,0,0,0,0});
    }

    @Test
    public void seconds() {
        assertArrayEquals("one second", new int[]{0,0,0,0,0}, Parser.fromDigital(  "00:00:01"));
        assertArrayEquals("two seconds", new int[]{1,0,0,0,0}, Parser.fromDigital(  "00:00:02"));
        assertArrayEquals("58 seconds edge case", new int[]{1,0,0,0,0}, Parser.fromDigital("00:00:58"));
        assertArrayEquals("59 seconds edge case", new int[]{0,0,0,0,0}, Parser.fromDigital("00:00:59"));
    }

    @Test
    public void minutes() {
        assertArrayEquals("one minute", new int[]{0,0,0,0,1}, Parser.fromDigital("00:01:01"));
        assertArrayEquals("four minutes", new int[]{0,0,0,0,4}, Parser.fromDigital("00:04:01"));
        assertArrayEquals("five minutes", new int[]{0,0,0,1,0}, Parser.fromDigital("00:05:01"));
        assertArrayEquals("eleven minutes", new int[]{0,0,0,2,1}, Parser.fromDigital("00:11:01"));
        assertArrayEquals("fifty-nine minutes", new int[]{0,0,0,11,4}, Parser.fromDigital("00:59:01"));
    }

    @Test
    public void hours() {
        assertArrayEquals("one hour", new int[]{0,0,1,0,0}, Parser.fromDigital("01:00:01"));
        assertArrayEquals("four hours", new int[]{0,0,4,0,0}, Parser.fromDigital("04:00:01"));
        assertArrayEquals("five hours", new int[]{0,1,0,0,0}, Parser.fromDigital("05:00:01"));
        assertArrayEquals("eleven hours", new int[]{0,2,1,0,0}, Parser.fromDigital("11:00:01"));
        assertArrayEquals("twenty-three hours", new int[]{0,4,3,0,0}, Parser.fromDigital("23:00:01"));
    }

    @Test
    public void acceptance() {
        assertArrayEquals("Acceptance test - valid", new int[]{1,2,0,6,1}, Parser.fromDigital("10:31:00"));
    }


    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldThrowInvalidTime() {
        expectedException.expect(DateTimeException.class);
        Parser.fromDigital("25:00:00");
    }

    @Test
    public void shouldThrowBadTimeSyntax() {
        expectedException.expect(DateTimeException.class);
        Parser.fromDigital("foobar");
    }
}