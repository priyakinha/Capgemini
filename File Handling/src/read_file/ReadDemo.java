package read_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadDemo {
    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("data/Student.txt"));
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
