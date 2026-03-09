package Exercise1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import static java.lang.Thread.sleep;

public class CopyDataThread implements Runnable {
    public void run(){

        try {
            Path source = Path.of("C:/Users/ASUS/IdeaProjects/MultiThreadingAssignment/src/source.txt");
            Path destination = Path.of("C:/Users/ASUS/IdeaProjects/MultiThreadingAssignment/src/destination.txt");
            FileReader fr = new FileReader(source.toFile());
            FileWriter fw = new FileWriter(destination.toFile());

            int data = 0;
            int n = 0;
            while ((data = fr.read()) != -1) {
                fw.write(data);
                n = n + 1;
                if (n == 10) {
                    System.out.println("10 Characters are read");
                    n = 0;
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            fr.close();
            fw.close();
            System.out.println("File Copied Successfully");
        }catch(IOException e){
            System.out.println("Error!!");
        }

    }

}
