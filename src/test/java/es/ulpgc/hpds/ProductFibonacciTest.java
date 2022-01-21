package es.ulpgc.hpds;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductFibonacciTest {

    @Test
    public void test_Product_Of_Fibonacci_0(){
        ProductFibonacci productFibo = new ProductFibonacci();
        int[] expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(productFibo.productFibo(0), expectedResult);
    }
}
