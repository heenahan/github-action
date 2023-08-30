package com.example.githubaction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("2 + 3 = 5")
    void test() {
        int result = calculator.add(2, 3);
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("실패하는 테스트")
    void failTest() {
        int result = calculator.add(2, 3);
        assertThat(result).isEqualTo(1);
    }

}