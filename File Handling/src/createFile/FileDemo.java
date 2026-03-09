package createFile;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File folder=new File("data");
        if(!folder.exists()){
            boolean created=folder.mkdir();
            if(created){
                System.out.println("Folder created Successfully!!");
            }else{
                System.out.println("Folder creation failed!!");
            }
        }else{
            System.out.println("Folder already exists!!");
        }
    }
}
