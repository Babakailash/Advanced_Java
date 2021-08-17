package multithreading;

class Thread2 implements java.lang.Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread2 is running");
        } catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
