import org.iiitb.Calculator;
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator myCalculator;

    @Before
    public void setUp(){
        myCalculator = new Calculator();
    }

    @Test
    public void truePositiveSqRoot(){
        double number = 4;
        double actual = 2;
        assertEquals("Finding square root for True Positive",myCalculator.sqRoot(number), actual, 0.2f);
    }

    @Test
    public void trueNegativeSqRoot(){
        double number = 16;
        double actual = 8;
        assertNotEquals("Finding square root for True Negative",myCalculator.sqRoot(number), actual, 0.2f);
    }

    @Test
    public void truePositiveFactorial(){
        int number = 5;
        int actual = 120;
        assertEquals("Finding Factorial for True Positive",myCalculator.factorial(number), actual, 0.2f);
    }

    @Test
    public void trueNegativeFactorial(){
        int number = 5;
        int actual = 720;
        assertNotEquals("Finding Factorial for True Negative",myCalculator.factorial(number), actual, 0.2f);
    }

    @Test
    public void truePositiveNaturalLog(){
        double number = 2.71;
        double actual = 0.99694;
        assertEquals("Finding Natural Log for True Positive",myCalculator.naturalLog(number), actual, 0.2f);
    }

    @Test
    public void trueNegativeNaturalLog(){
        double number = 1;
        double actual = 2;
        assertNotEquals("Finding Natural Log for True Negative",myCalculator.naturalLog(number), actual, 0.2f);
    }

    @Test
    public void truePositivePower(){
        double base = 5.5;
        double exponent = 3;
        double actual = 166.375;
        assertEquals("Finding Power for True Positive",myCalculator.power(base, exponent), actual, 0.2f);
    }

    @Test
    public void trueNegativePower(){
        double base = 4;
        double exponent = 3;
        double actual = 125;
        assertNotEquals("Finding Power for True Negative",myCalculator.power(base, exponent), actual, 0.2f);
    }
}
