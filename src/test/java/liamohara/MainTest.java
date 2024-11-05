package liamohara;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main = new Main();

    @Test
    @DisplayName("Returns 'You must provide diamond size as a positive odd integer' when provided with an zero")
    void makeDiamond_WhenProvidedWithZero() {

        int diamondSize = 0;
        String expectedString = "You must provide diamond size as a positive odd integer.";

        String result = main.makeDiamond(diamondSize);

        assertEquals(expectedString, result);

    }

    @Test
    @DisplayName("Returns 'You must provide diamond size as a positive odd integer' when provided with an negative integer")
    void makeDiamond_WhenProvidedWithNegativeInteger() {

        int diamondSize = -4;
        String expectedString = "You must provide diamond size as a positive odd integer.";

        String result = main.makeDiamond(diamondSize);

        assertEquals(expectedString, result);

    }

    @Test
    @DisplayName("Returns 'You must provide diamond size as a positive odd integer' when provided with a positive even integer")
    void makeDiamond_WhenProvidedWithPositiveEvenInteger() {

        int diamondSize = 4;
        String expectedString = "You must provide diamond size as a positive odd integer.";

        String result = main.makeDiamond(diamondSize);

        assertEquals(expectedString, result);

    }
}