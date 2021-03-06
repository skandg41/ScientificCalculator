import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA=1e-9;
    Calculator calculator= new Calculator();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Square root of number for True Positive", 4, calculator.squareRoot(16), DELTA);
        assertEquals("Square root of number for True Positive", 12.860793132618221, calculator.squareRoot(165.4), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Square root of number for False Positive", 5, calculator.squareRoot(81), DELTA);
        assertNotEquals("Square root of number for False Positive", 7.3, calculator.squareRoot(60), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Factorial of number for True Positive", 6, calculator.factorial(3), DELTA);
        assertEquals("Factorial root of number for True Positive", 120, calculator.factorial(5), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Factorial of number for False Positive", 10, calculator.factorial(4), DELTA);
        assertNotEquals("Factorial root of number for False Positive", 200, calculator.factorial(7), DELTA);
    }

    @Test
    public void naturalLogTruePositive(){
        assertEquals("Natural Log of number for True Positive", 4.052691950487722E76, calculator.factorial(57), DELTA);
        assertEquals("Natural Log of number for True Positive", 8.159152832478977E47, calculator.factorial(40), DELTA);
    }
    @Test
    public void naturalLogFalsePositive(){
        assertNotEquals("Natural Log of number for False Positive", 10, calculator.factorial(4), DELTA);
        assertNotEquals("Natural Log of number for False Positive", 200, calculator.factorial(7), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Power of number for True Positive", 400, calculator.power(20,2), DELTA);
        assertEquals("Power of number for True Positive", 729000, calculator.power(90,3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Power of number for False Positive", 100, calculator.power(9,2), DELTA);
        assertNotEquals("Power of number for False Positive", 50, calculator.power(7,2), DELTA);
    }
}
