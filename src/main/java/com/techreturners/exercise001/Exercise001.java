package com.techreturners.exercise001;

import java.util.List;
import java.util.Locale;

public class Exercise001 {
    /**
     * Capitalise the first word of the given string.
     * @param word to be capitalised
     * @return capitalised first word
     */
    public String capitalizeWord(String word) {
        // As this is a simple test,
        // we assume that the first character of the string (word)
        // is the first character of the word that requires being made uppercase
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    /**
     * Generate capitalised dot delimited initials for given words.
     * @param firstName to get initial of
     * @param lastName to get initial of
     * @return Capitalised initials separated by a '.'
     */
    public String generateInitials(String firstName, String lastName) {
        // As there is no documentation, I am assuming that the given names might be lowercase.
        return firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return 0.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
