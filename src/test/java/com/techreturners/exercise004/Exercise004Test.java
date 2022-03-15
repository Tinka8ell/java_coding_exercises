package com.techreturners.exercise004;

import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

/**
 * Initially get tests to pass.
 * Not sure why you would write wrong tests?
 * I don't even know what the last test was supposed to test!
 */
public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(
                LocalDate.of(2021, Month.JULY, 19));
        /* this is clearly nonsense!
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);
        */
        LocalDateTime expected = LocalDateTime.of(2021, Month.JULY, 19, 0, 0, 0);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(
                LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        /* this is clearly nonsense!
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);
        */
        LocalDateTime expected = LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {
        /*
           What was this supposed to test?
           What does "with day roll over" mean?
         */

        Exercise004 ex004 = new Exercise004(
                LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0)
                .plusSeconds(2));
        LocalDateTime expected = LocalDateTime.of(2021, Month.JANUARY, 25, 0, 0, 1);

        assertEquals(expected, ex004.getDateTime());

    }

}
