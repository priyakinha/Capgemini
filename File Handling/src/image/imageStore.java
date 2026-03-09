package image;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class imageStore {
    public static void main(String[] args) {
        String sourcePath="images/imageRead.jpg";
        String destination="output/copied.jpg";
        try{
            FileInputStream fis=new FileInputStream(sourcePath);
            FileOutputStream fos=new FileOutputStream(destination);
            byte[]buffer=new byte[1024];
            int bytesRead;
            while((bytesRead=fis.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);
            }
            fis.close();
            fos.close();
            System.out.println("Image Stored Successfully");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
