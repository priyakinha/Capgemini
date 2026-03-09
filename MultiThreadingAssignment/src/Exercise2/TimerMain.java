package Exercise2;

public class TimerMain {
    public static void main(String[] args) {
        TimerThread t=new TimerThread();
        Thread mt=new Thread(t);
        mt.start();
    }
}
