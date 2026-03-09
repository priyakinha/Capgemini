import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteDemo {
    public static void main(String[] args) {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("data/student.txt"));
            writer.write("\nName : Priya");
            writer.newLine();
            writer.write("Course : Spring");
            writer.newLine();
            writer.write("Marks: 90");
            writer.close();
            System.out.println("Data written using bufferedWriter");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
