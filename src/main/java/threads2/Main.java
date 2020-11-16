package threads2;

public class Main {
    public static void main(String[] args) {
        Thread fibThread = new Thread(new FibonacciRunner(30));
        Thread facThread = new Thread(new FactorialRunner(20));

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
