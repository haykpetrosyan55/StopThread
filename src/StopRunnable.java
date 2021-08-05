public class StopRunnable extends Thread{

    private boolean stopRequested = false;
    public synchronized void requestStop(){
        this.stopRequested = true;
    }
    public synchronized boolean isStopRequested(){
        return this.stopRequested;
    }
    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        System.out.println("StopRunnable Running");
        while (!isStopRequested()){
            sleep(1000);
            System.out.println("...");
        }
        System.out.println("StopRunnable stopped");

    }
}
