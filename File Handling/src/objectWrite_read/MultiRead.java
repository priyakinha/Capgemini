package objectWrite_read;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MultiRead {
    public static void main(String[] args) {
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("data/studentObj1.txt"))){
            while(true){
                Student s=(Student) in.readObject();
                System.out.println(s.id+" "+s.name);
            }
        }catch(EOFException e){
            System.out.println("All objects read successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
