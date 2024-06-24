package org.kviat;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;
import static org.junit.jupiter.api.Assertions.*;

class SimpleTest {

    @Test
    void smallAgeDifference() {
        int age1 = 24;
        int age2 = 19;
        Assumptions.assumeTrue(age1 >= 18 && age2 >= 18, "Assumption failed: one of age parameters is less than 18");
        assertTrue(Math.abs(age1 - age2) <= 10, "Age difference is bigger than 10");
    }
}