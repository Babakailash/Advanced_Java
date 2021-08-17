package multithreading.synchronization;

public class MathUtils {
    void  getMultiples(int n) { //we can use synchronized method.
        synchronized (this) { // or we can use synchronized block.
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
