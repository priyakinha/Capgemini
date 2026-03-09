package createFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) {
        try{
            doWrite();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void doWrite() throws IOException{
        FileWriter writer=new FileWriter("data/student.txt",true);
        writer.write("\nName: GV");
        writer.write("\nCourse: MCA");
        writer.write("\nMarks: 85");
        writer.close();
        System.out.println("Data Written Success");
    }
}
