package es.ulpgc.hpds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductFibonacciTest {

    private ProductFibonacci productFibo;
    private int[] expectedResult;

    @Before
    public void setUp(){
        productFibo = new ProductFibonacci();
    }

    @Test
    public void test_Product_Of_Fibonacci_0(){
        expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(productFibo.productFibo(0), expectedResult);
    }

    @Test
    public void test_Product_Of_Fibonacci_1(){
        expectedResult = new int[]{1, 1, 1};
        assertArrayEquals(productFibo.productFibo(1), expectedResult);
    }

    @Test
    public void test_Product_Of_Fibonacci_714(){
        expectedResult = new int[]{21, 34, 1};
        assertArrayEquals(productFibo.productFibo(714), expectedResult);
    }

    @Test
    public void test_Product_Of_Fibonacci_800(){
        expectedResult = new int[]{34, 55, 0};
        assertArrayEquals(productFibo.productFibo(800), expectedResult);
    }
}
