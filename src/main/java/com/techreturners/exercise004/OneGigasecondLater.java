package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Initially make this a wrapper for a LocalDateTime object.
 */
public class OneGigasecondLater {

    public static final int KILO = 1000;
    public static final int MEGA = KILO * KILO;
    public static final int GIGA = MEGA * KILO;
    private final LocalDateTime dateTime;

    public OneGigasecondLater(LocalDate date) {
        this(LocalDateTime.of(date, LocalTime.MIDNIGHT));
    }

    public OneGigasecondLater(LocalDateTime dateTime) {
        this.dateTime = dateTime.plusSeconds(GIGA); // add 1 gigasecond (10^9)
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
