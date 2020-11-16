package threads2;

public class FactorialRunner implements Runnable {
    private int n;

    /**
     * Create a new Fibonacci thread
     *
     * @param n the Fibonacci number to compute, {@code n >= 0}
     */
    public FactorialRunner(int n) {
        this.n = n;
    }

    public long computeFactorial() {
        if (n == 0) {
            return 1;
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public void run() {
        System.out.printf("Factorial(%d): %d\n", n, computeFactorial());
    }
}
