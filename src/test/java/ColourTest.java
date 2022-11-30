import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    Colour coloura1 = new Colour(1.0f, 1.0f, 1.0f);
    Colour coloura2 = new Colour(0.0f, 0.0f, 0.0f);
    Colour colourb1 = new Colour("111100001111000011110000");

    @Test
    void inputValidation() {
        assertEquals(255, coloura1.red);
        assertEquals(255, coloura1.green);
        assertEquals(255, coloura1.blue);
        assertEquals(0, coloura2.red);
        assertEquals(0, coloura2.green);
        assertEquals(0, coloura2.blue);
        assertEquals(240, colourb1.red);
        assertEquals(240, colourb1.green);
        assertEquals(240, colourb1.blue);
    }

    @Test
    void valuesInBounds() {
        int maxBound = 255;
        int minBound = 0;
        assertTrue(coloura1.red <= maxBound);
        assertTrue(coloura1.red >= minBound);
        assertTrue(coloura1.green <= maxBound);
        assertTrue(coloura1.green >= minBound);
        assertTrue(coloura1.blue <= maxBound);
        assertTrue(coloura1.blue >= minBound);
        assertTrue(coloura2.red <= maxBound);
        assertTrue(coloura2.red >= minBound);
        assertTrue(coloura2.green <= maxBound);
        assertTrue(coloura2.green >= minBound);
        assertTrue(coloura2.blue <= maxBound);
        assertTrue(coloura2.blue >= minBound);
        assertTrue(colourb1.red <= maxBound);
        assertTrue(colourb1.red >= minBound);
        assertTrue(colourb1.green <= maxBound);
        assertTrue(colourb1.green >= minBound);
        assertTrue(colourb1.blue <= maxBound);
        assertTrue(colourb1.blue >= minBound);

        assertFalse(coloura1.red > maxBound);
        assertFalse(coloura1.red < minBound);
        assertFalse(coloura1.green > maxBound);
        assertFalse(coloura1.green < minBound);
        assertFalse(coloura1.blue > maxBound);
        assertFalse(coloura1.blue < minBound);
        assertFalse(coloura2.red > maxBound);
        assertFalse(coloura2.red < minBound);
        assertFalse(coloura2.green > maxBound);
        assertFalse(coloura2.green < minBound);
        assertFalse(coloura2.blue > maxBound);
        assertFalse(coloura2.blue < minBound);
        assertFalse(colourb1.red > maxBound);
        assertFalse(colourb1.red < minBound);
        assertFalse(colourb1.green > maxBound);
        assertFalse(colourb1.green < minBound);
        assertFalse(colourb1.blue > maxBound);
        assertFalse(colourb1.blue < minBound);
    }

    @Test
    void correctValueType() {
    }
}