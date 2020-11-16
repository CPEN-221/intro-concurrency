package threads1;

public class Main {

    public static void main(String[] args) {
        FibonacciThread fibThread = new FibonacciThread(30);
        FactorialThread facThread = new FactorialThread(10);

        try {
            fibThread.start();
            facThread.start();
            fibThread.join();
            facThread.join();
            System.out.println("Done!");
        }
        catch (InterruptedException ie) {
            System.out.println(ie);
        }
        catch (Exception e) {
            System.out.println("Unknown exception");
            System.out.println(e);
        }
    }

}
