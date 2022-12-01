import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    Colour colour1 = new Colour(1.0f, 1.0f, 1.0f);
    Colour colour2 = new Colour(0.0f, 0.0f, 0.0f);
    Colour colour3 = new Colour("111100001111000011110000");

    @Test
    void testMapping() {
        assertEquals(255, colour1.red);
        assertEquals(255, colour1.green);
        assertEquals(255, colour1.blue);
        assertEquals(0, colour2.red);
        assertEquals(0, colour2.green);
        assertEquals(0, colour2.blue);
        assertEquals(240, colour3.red);
        assertEquals(240, colour3.green);
        assertEquals(240, colour3.blue);
    }

    @Test
    void valuesInBounds() {
        int maxBound = 255;
        int minBound = 0;
        assertTrue(colour1.red <= maxBound);
        assertTrue(colour1.red >= minBound);
        assertTrue(colour1.green <= maxBound);
        assertTrue(colour1.green >= minBound);
        assertTrue(colour1.blue <= maxBound);
        assertTrue(colour1.blue >= minBound);
        assertTrue(colour2.red <= maxBound);
        assertTrue(colour2.red >= minBound);
        assertTrue(colour2.green <= maxBound);
        assertTrue(colour2.green >= minBound);
        assertTrue(colour2.blue <= maxBound);
        assertTrue(colour2.blue >= minBound);
        assertTrue(colour3.red <= maxBound);
        assertTrue(colour3.red >= minBound);
        assertTrue(colour3.green <= maxBound);
        assertTrue(colour3.green >= minBound);
        assertTrue(colour3.blue <= maxBound);
        assertTrue(colour3.blue >= minBound);
    }

    @Test
    void testInputLength() {
        assertEquals(colour3.rgb.length(), 24);
    }

    @Test
    void testInputIsBinary() {
        for (int i = 0; i < colour3.rgb.length(); i++) {
            assertTrue((colour3.rgb.substring(i, i+1).equals("1") || colour3.rgb.substring(i, i+1).equals("0")));
        }
    }
}