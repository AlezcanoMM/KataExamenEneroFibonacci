package es.ulpgc.hpds;

public class ProductFibonacci {

    Fibonacci fibo = new Fibonacci();

    public int[] productFibo(int product){
        int[] res = new int[3];
        int n = 0;
        while(true){
            res[0] = fibo.getFibonacciOf(n);
            res[1] = fibo.getFibonacciOf(n+1);
            if((fibo.getFibonacciOf(n) * fibo.getFibonacciOf(n+1)) == product){
                res[2] = 1;
                return res;
            } else if((fibo.getFibonacciOf(n) * fibo.getFibonacciOf(n+1)) > product){
                res[2] = 0;
                return res;
            }
            n++;
        }
    }
}
