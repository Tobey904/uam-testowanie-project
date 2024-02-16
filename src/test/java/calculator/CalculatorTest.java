package calculator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void PowerTwoNumbersTest() {
        Assert.assertEquals(343, calculator.powerTwoNumbers(7, 3), 0);
    }

    @Test
    public void SqrtTest() {
        Assert.assertEquals(7, calculator.sqrt(49), 0);
    }

    @Test
    public void CalculateSquareAreaTest() {
        Assert.assertEquals(64, calculator.CalculateSquareArea(8), 0);
    }

    @Test
    public void CalculateRectAreaTest() {
        Assert.assertEquals(63, calculator.CalculateRectArea(9, 7), 0);
    }

    @Test
    public void CalculateSquareCircTest() {
        Assert.assertEquals(36, calculator.CalculateSquareCirc(9));
    }

    @Test
    public void CalculateRectCircTest() {
        Assert.assertEquals(10, calculator.CalculateRectCirc(1, 4));
    }

    @Test
    public void CalculateTriangleAreaTest() {
        Assert.assertEquals(27, calculator.CalculateTriangleArea(9, 6), 0);
    }

    @Test
    public void CalculateTriangleCircTest() {
        Assert.assertEquals(17, calculator.CalculateTriangleCirc(3, 5, 9), 0);
    }

    @Test
    public void ConvertCelsiusToFarenheitTest() {
        Assert.assertEquals(50, calculator.convertCelsiusToFarenheit(10), 0);
    }

    @Test
    public void ConvertFarenheitToCelsiusTest() {
        Assert.assertEquals(10, calculator.convertFarenheitToCelsius(50), 0);
    }

    @Test
    public void ConvertFromMphToKphTest() {
        Assert.assertEquals(16.1, calculator.convertFromMphToKph(10), 0);
    }

    @Test
    public void FactorialTest() {
        Assert.assertEquals(24, calculator.factorial(4));
    }

    @Test
    public void FibbonacciTest() {
        Assert.assertEquals(5, calculator.fibbonacci(5));
    }

    @Test
    public void FindGCDTest() {
        Assert.assertEquals(3, calculator.findGCD(9, 6));
    }

    @Test
    public void FindLCMTest() {
        Assert.assertEquals(20, calculator.findLCM(5, 4));
    }

    @Test
    public void isPrimeTest1() {
        Assert.assertFalse(calculator.isPrime(1));
    }

    @Test
    public void isPrimeTest2() {
        Assert.assertFalse(calculator.isPrime(4));
    }

    @Test
    public void isPrimeTest3() {
        Assert.assertTrue(calculator.isPrime(19));
    }
}