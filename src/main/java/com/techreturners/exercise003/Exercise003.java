package com.techreturners.exercise003;

/**
 * KISS - Keep it simple stupid!
 * Is this really this simple?
 * Am I missing something?
 */
public class Exercise003 {
    /**
     * Look up table to convert names to id:
     * - Pistachio: 0
     * - Raspberry Ripple: 1
     * - Vanilla: 2
     * - Mint Chocolate Chip: 3
     * - Chocolate: 4
     * - Mango Sorbet: 5
     */
    private static final String[] lookUpTable = {
            "Pistachio",
            "Raspberry Ripple",
            "Vanilla",
            "Mint Chocolate Chip",
            "Chocolate",
            "Mango Sorbet"
    };

    int getIceCreamCode(String iceCreamFlavour) {
        int index = -1;
        for (int i = 0; i < lookUpTable.length; i++) {
            if (iceCreamFlavour.equalsIgnoreCase(lookUpTable[i])){
                index = i;
                break;
            }
        }
        return index;
    }

    String[] iceCreamFlavours() {
        return lookUpTable;
    }

}
