
import static org.junit.Assert.*;
import org.junit.Test;

public class Calculator_Test {
    Calculator calculator = new Calculator();

    @Test
    public void square_rootTruePositive(){
        double DELTA = 1e-12;
        assertEquals("Finding square root for True Positive", 8, calculator.square_root(64), DELTA);
        assertEquals("Finding square root for True Positive", 9, calculator.square_root(81), DELTA);
    }

    @Test
    public void square_rootFalsePositive(){
        double DELTA = 1e-12;
        assertNotEquals("Finding square root for False Positive", 2, calculator.square_root(7), DELTA);
        assertNotEquals("Finding square root for False Positive", 1, calculator.square_root(4), DELTA);

    }

    @Test
    public void factorialTruePositive(){
        double DELTA = 1e-12;
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.factorial(1), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        double DELTA = 1e-12;
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.factorial(3), DELTA);
    }

    @Test
    public void natural_logTruePositive(){
        double DELTA = 1e-12;
        assertEquals("Finding natural log for True Positive", 0, calculator.natural_log(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.natural_log(1), DELTA);
    }

    @Test
    public void natural_logFalsePositive(){
        double DELTA = 1e-12;
        assertNotEquals("Finding natural log for False Positive", 2.4, calculator.natural_log(10), DELTA);
        assertNotEquals("Finding natural log for False Positive", 3.8, calculator.natural_log(2), DELTA);
    }

    @Test
    public void power_funcTruePositive(){
        double DELTA = 1e-12;
        assertEquals("Finding power for True Positive", 81, calculator.power_func(3, 4), DELTA);
        assertEquals("Finding power for True Positive", 8, calculator.power_func(2, 3), DELTA);
    }

    @Test
    public void power_funcFalsePositive(){
        double DELTA = 1e-12;
        assertNotEquals("Finding power for False Positive", -9, calculator.power_func(2, 4), DELTA);
        assertNotEquals("Finding power for False Positive", 4, calculator.power_func(6, 1), DELTA);
    }




}