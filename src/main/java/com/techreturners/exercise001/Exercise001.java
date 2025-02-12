package com.techreturners.exercise001;

import java.util.List;
import java.util.stream.Stream;

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

    /**
     * Return the price including vat.
     * @param originalPrice as provided to 2 decimal places
     * @param vatRate as a percentage to add
     * @return Original price + vat to 2 decimal places
     */
    public double addVat(double originalPrice, double vatRate) {
        // could have split this out, but the logic is just too trivial!
        // to pass the tests, have to assume the currency is rounded down to 2 dp
        return Math.floor(originalPrice * (1 + vatRate / 100.0) * 100.0) / 100.0;
    }

    /**
     * Simple string reversal.
     * @param sentence to be reversed
     * @return the characters in sentence in reverse order
     */
    public String reverse(String sentence) {
        // Wanted to use this as an exercise in using streams, but StringBuffer has a method already
        String result = null;
        if (null != sentence){
            result = (new StringBuilder(sentence).reverse()).toString();
        }
        return result;
    }

    /**
     * Count the number of users of type "Linux".
     * This does not require it, but,
     * as there is no checking of types in class User,
     * I do a non-case match for the User.type.
     * @param users List of user objects
     * @return Count of those users with type of "linux"
     */
    public int countLinuxUsers(List<User> users) {
        // Yea, get to play with Streams!
        return (int) users.stream().map(User::getType)
                .filter(userType -> userType.equalsIgnoreCase("Linux"))
                .count();
    }
}
