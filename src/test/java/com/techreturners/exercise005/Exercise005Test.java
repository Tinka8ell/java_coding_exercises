package com.techreturners.exercise005;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Exercise005Test {

    private Exercise005 ex005;

    @Before
    public void setup() {
        ex005 = new Exercise005();
    }

    @Test
    public void checkEmptySentenceIsNotAPangram() {
        assertFalse(ex005.isPangram(""));
    }

    @Test
    public void checkPerfectLowerCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void checkPerfectUpperCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void checkSentenceWithLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing wiZards Jump QuicklY"));
    }

    @Test
    public void checkSentenceWithMissingLetterXIsNotAPangram() {
        assertFalse(ex005.isPangram("the quick brown fo jumps over the lazy dog"));
    }

    @Test
    public void checkSentenceWithMissingLetterHIsNotAPangram() {
        assertFalse(ex005.isPangram("five boxing wizards jump quickly at it"));
    }

    @Test
    public void checkSentenceWithUnderscoresIsAPangram() {
        assertTrue(ex005.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    @Test
    public void checkSentenceWithNumbersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }

    @Test
    public void checkExamplesFromWebsite() {
        /*
           https://pangrampangram.com/blogs/journal/best-pangrams-a-tool-for-every-graphic-designers
           Using the samples from this page ...
         */
        String[] samples = {
                "Two driven jocks help fax my big quiz.",
                "Fickle jinx bog dwarves spy math quiz.",
                "Public junk dwarves hug my quartz fox.",
                "Quick fox jumps nightly above wizard.",
                "Five quacking zephyrs jolt my wax bed.",
                "The five boxing wizards jump quickly.",
                "Pack my box with five dozen liquor jugs.",
                "The quick brown fox jumps over the lazy dog.",
                "When zombies arrive, quickly fax judge Pat.",
                "Woven silk pyjamas exchanged for blue quartz.",
                "The quick onyx goblin jumps over the lazy dwarf.",
                "Foxy diva Jennifer Lopez wasn’t baking my quiche.",
                "My girl wove six dozen plaid jackets before she quit.",
                "Grumpy wizards make a toxic brew for the jovial queen.",
                "A quivering Texas zombie fought republic linked jewelry.",
                "All questions asked by five watched experts amaze the judge.",
                "Back in June we delivered oxygen equipment of the same size.",
                "The wizard quickly jinxed the gnomes before they vaporized.",
                "We promptly judged antique ivory buckles for the next prize.",
                "Jim quickly realized that the beautiful gowns are expensive."
        };
        for (String sentence : samples) {
            assertTrue(ex005.isPangram(sentence));
        }
    }

}
