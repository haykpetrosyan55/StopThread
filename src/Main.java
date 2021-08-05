public class Main {

    public static void main(String[] args) {

        StopRunnable stopRunnable = new StopRunnable();
        stopRunnable.start();
//        Thread thread = new Thread(stopRunnable,"myThread");
//        thread.start();
        try {
            System.out.println("Thread is sleep 5000ms");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("requesting stop");
        stopRunnable.requestStop();
        System.out.println("stop requesting");
    }
}
