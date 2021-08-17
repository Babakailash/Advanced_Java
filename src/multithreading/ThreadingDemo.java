package multithreading;
/*Definition: A thread is a single sequential flow of control within a program. ...
As a sequential flow of control, a thread must carve out some of its own resources within a running program. For example, a
thread must have its own execution stack and program counter.*/

public class ThreadingDemo {

    public static void main(String[] args) {
        int n = 10; // number of threads
        for(int i = 0; i<n; i++){
            Thread1 t1 = new Thread1();
            t1.start();

            Thread t2 = new Thread(new Thread2());
            t2.start();
        }
    }
}
