package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    @Test
    void displayResultTests() {

        assertAll("All cases",
                ()->assertEquals("Gobbles you down in one byte!", DragonCave.displayResult("1")),
                ()->assertEquals("Offers you some of his treasure. You got lucky this time.", DragonCave.displayResult("2")),
                );
    }
}