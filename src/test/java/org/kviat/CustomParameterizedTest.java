package org.kviat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class CustomParameterizedTest {
    @ParameterizedTest
    @ValueSource(ints = {-7, 6, 2, -3, 9})
    void canDivByThree(int number) {
        assumingThat(number >=0 , () -> {
            assertEquals(0, number % 3, "The number cannot be divided by three");
        });
    }
}
