package Exercise2;

import static java.lang.Thread.sleep;

public class TimerThread implements Runnable{
    public void run(){
        System.out.println("Timer Starting...");
        int count=1;
      while(true){
          System.out.println("Timer: "+count+" seconds");
          try {
              sleep(1000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          if(count==10){
              count=0;
          }
          count++;
      }
    }
}
