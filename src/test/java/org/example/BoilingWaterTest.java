package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Boiling water class test")
class BoilingWaterTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }
    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }
    @Test
    @DisplayName("Test boilingWater() method")
    void TestBoilingWaterUnder212() {

        assertEquals("Water is not hot enough. Please try again!", BoilingWater.boilingWater(200));
        assertEquals("Water is boiling!", BoilingWater.boilingWater(212));
        assertEquals("Water is boiling!", BoilingWater.boilingWater(250));
    }
}