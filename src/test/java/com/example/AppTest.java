package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    // To intentionally create a failing test for demo purposes, uncomment the block below:
     @Test
     void intentionalFailure() {
        assertEquals(1, 2, "This test should fail for demo");
     }
}
