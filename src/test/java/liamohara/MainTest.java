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

    @Test
    @DisplayName("Returns 'Too small. The smallest diamond possible is 3.' when provided with a diamond size of 1")
    void makeDiamond_WhenProvidedWithDiamondSizeOfOne() {

        int diamondSize = 1;
        String expectedString = "Too small. The smallest diamond possible is 3.";

        String result = main.makeDiamond(diamondSize);

        assertEquals(expectedString, result);

    }

    @Test
    @DisplayName("Returns three-row diamond when provided with a diamond size of 3")
    void makeDiamond_WhenProvidedWithDiamondSizeOfThree() {

        int diamondSize = 3;
        String expectedString = " *\n***\n *";

        String result = main.makeDiamond(diamondSize);

        assertEquals(expectedString, result);

    }

    @Test
    @DisplayName("Returns five-row diamond when provided with a diamond size of 5")
    void makeDiamond_WhenProvidedWithDiamondSizeOfFive() {

        int diamondSize = 5;
        String expectedString = "  *\n ***\n*****\n ***\n  *";

        String result = main.makeDiamond(diamondSize);

        assertEquals(expectedString, result);

    }
}