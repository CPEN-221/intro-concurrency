package threads1;

public class FactorialThread extends Thread {
    private int n;

    /**
     * Create a new Factorial thread
     *
     * @param n the factorial to compute, {@code n >= 0}
     */
    public FactorialThread(int n) {
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
        System.out.printf("Thread %d: Factorial(%d): %d\n",
                this.getId(), n, computeFactorial());
    }
}
