package objectWrite_read;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWrite {
    public static void main(String[] args) {
        Student s=new Student(1,"Ammy");
        Student s1=new Student(2,"Vayuu");
        Student s2=new Student(3,"Kinha");
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("data/studentObj1.txt"))){
            out.writeObject(s);
            out.writeObject(s1);
            out.writeObject(s2);
            System.out.println("Objects saved successfully!!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
