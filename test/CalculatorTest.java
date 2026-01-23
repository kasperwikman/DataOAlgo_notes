import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testMultiplyTwoNumbers() {

        assertEquals(6.0, calculator.multiply(2.0, 3.0));
    }

    @Test
    void testMultiplyThreeNumbers() {

        assertEquals(16.0, calculator.multiply(2.0, 2.0, 4.0));
    }
}