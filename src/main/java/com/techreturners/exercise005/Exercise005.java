package com.techreturners.exercise005;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exercise005 {

    public boolean isPangram(String input) {
        return input
                .toLowerCase() // have to do it sometime, so bit the bullet now and use built-in function
                .chars() // get it into a stream
                .filter(a -> a >= 'a' && a <= 'z') // we are told it's ascii chars, so can limit it with this
                .distinct() // leave one of each distinct letter
                .count() >= 26; // check if we have all 26 (should never be > 26, but just in case!)
    }

}
