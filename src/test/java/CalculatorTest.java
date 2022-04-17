import org.iiitb.Calculator;
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator myCalc;

    @Before
    public void setting_up(){
        myCalc = new Calculator();
    }
    //writing the testcases
    @Test
    public void correct_sq_root(){
        int number = 25;
        double actual = 5;
        assertEquals("Calculating square root for correct case",myCalc.squareRoot(number), actual, 0.2f);
    }

    @Test
    public void wrong_sq_root(){
        int number = 25;
        double actual = 7;
        assertNotEquals("Calculating square root for wrong case",myCalc.squareRoot(number), actual, 0.2f);
    }

    @Test
    public void correct_Factorial(){
        int number = 4;
        int actual = 24;
        assertEquals("Calculating Factorial for correct case",myCalc.fact(number), actual, 0.2f);
    }

    @Test
    public void wrong_Factorial(){
        int number = 7;
        int actual = 800;
        assertNotEquals("Calculating Factorial for wrong case",myCalc.fact(number), actual, 0.2f);
    }

    @Test
    public void correct_NaturalLog(){
        double number = 2.71;
        double actual = 0.99694;
        assertEquals("Calculating Natural Log for correct case",myCalc.natLog(number), actual, 0.2f);
    }

    @Test
    public void wrong_NaturalLog(){
        double number = 10;
        double actual = 3;
        assertNotEquals("Calculating Natural Log for wrong case",myCalc.natLog(number), actual, 0.2f);
    }

    @Test
    public void correct_Power(){
        int base = 3;
        int exponent = 2;
        double actual = 9;
        assertEquals("Calculating Power for correct case",myCalc.Power(base, exponent), actual, 0.2f);
    }
    @Test
    public void correct_Power1(){
        int base = 4;
        int exponent = 2;
        double actual = 16;
        assertEquals("Calculating Power for correct case",myCalc.Power(base, exponent), actual, 0.2f);
    }
    @Test
    public void correct_Power2(){
        int base = 7;
        int exponent = 2;
        double actual = 49;
        assertEquals("Calculating Power for correct case",myCalc.Power(base, exponent), actual, 0.2f);
    }

    @Test
    public void wrong_Power(){
        int base = 2;
        int exponent = 4;
        double actual = 64;
        assertNotEquals("Calculating Power for wrong case",myCalc.Power(base, exponent), actual, 0.2f);
    }
}
