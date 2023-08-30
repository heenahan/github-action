package com.example.githubaction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void test() {
        int result = calculator.add(2, 3);
        assertThat(result).isEqualTo(5);
    }

}