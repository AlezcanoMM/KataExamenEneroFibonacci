package es.ulpgc.hpds;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void test_Fibonacci_of_0(){
        Fibonacci fibo = new Fibonacci();
        assertEquals(fibo.getFibonacciOf(0), 0);
    }

    @Test
    public void test_Fibonacci_of_1(){
        Fibonacci fibo = new Fibonacci();
        assertEquals(fibo.getFibonacciOf(1), 1);
    }
}
