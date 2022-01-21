package es.ulpgc.hpds;

public class Fibonacci {

    public int getFibonacciOf(int n) {
        if(n <= 1){
            return n;
        }
        return getFibonacciOf(n-1) + getFibonacciOf(n-2);
    }
}
