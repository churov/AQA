package lesson7;

import java.io.FileReader;
import java.io.IOException;


public class ReadCVS {
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("C:\\Users\\anduser\\Desktop\\test.csv"))
        {

            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}