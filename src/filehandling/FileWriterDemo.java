package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        //character stream
        try {
            FileWriter fileWriter = new FileWriter("fileWriterTest.txt");
            fileWriter.write("Today is Thursday");
            System.out.println("File write Successfully");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("fileWriterTest.txt");
            int i = fileReader.read();
            while (i>0){
                System.out.print((char)i);
                i = fileReader.read();
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
