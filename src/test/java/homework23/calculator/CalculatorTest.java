package homework23.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calc = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @Test
    void fold() {

        assertEquals(5, calc.fold(2, 3));
    }

    @Test
    void subtract() {
        assertEquals(4, calc.subtract(7, 3));
    }

    @Test
    void multiply() {
        assertEquals(15, calc.multiply(5, 3));
    }

    @Test
    void divideWithRem() {
        assertEquals(2, calc.divideWithRem(10, 4));
        assertEquals(Integer.MIN_VALUE, calc.divideWithRem(10, 0));
    }

    @Test
    void intDivision() {
        assertEquals(3, calc.intDivision(10, 3));
        assertEquals(Integer.MIN_VALUE, calc.intDivision(10, 0));
    }
}