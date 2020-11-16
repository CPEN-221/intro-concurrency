package threads2;

public class FibonacciRunner implements Runnable {

    private int n;

    /**
     * Create a new Fibonacci thread
     *
     * @param n the Fibonacci number to compute, {@code n >= 0}
     */
    public FibonacciRunner(int n) {
        this.n = n;
    }

    public long computeFibonacci() {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        long fib0 = 0;
        long fib1 = 1;
        int i = 1;

        while (i < n) {
            long temp = fib0;
            fib0 = fib1;
            fib1 = temp + fib0;
            i++;
        }

        return fib1;
    }

    public void run() {
        System.out.printf("Fibonacci(%d): %d\n", n, computeFibonacci());
    }
}
