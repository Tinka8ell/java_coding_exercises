package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Initially make this a wrapper for a LocalDateTime object.
 */
public class Exercise004 {

    private final LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        this(LocalDateTime.of(date, LocalTime.MIDNIGHT));
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime.plusSeconds(1000000000); // add 1 gigasecond (10^9)
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
