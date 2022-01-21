package es.ulpgc.hpds;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    private Fibonacci fibo;

    @Before
    public void setUp(){
        fibo = new Fibonacci();
    }

    @Test
    public void test_Fibonacci_of_0(){
        assertEquals(fibo.getFibonacciOf(0), 0);
    }

    @Test
    public void test_Fibonacci_of_1(){
        assertEquals(fibo.getFibonacciOf(1), 1);
    }

    @Test
    public void test_Fibonacci_of_2(){
        assertEquals(fibo.getFibonacciOf(2), 1);
    }

    @Test
    public void test_Fibonacci_of_8(){
        assertEquals(fibo.getFibonacciOf(8), 21);
    }
}
