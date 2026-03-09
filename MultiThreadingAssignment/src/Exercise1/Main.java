package Exercise1;

public class Main {
    public static void main(String[] args) {
        CopyDataThread c=new CopyDataThread();
        Thread t=new Thread(c);
        t.start();
    }
}
