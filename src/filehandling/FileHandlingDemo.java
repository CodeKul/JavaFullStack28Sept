package filehandling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {

        File file = new File("/home/vaibhav/workspace/Sept28Java/src/filehandling/test.txt");

        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
//ByteStream
        try {
            fileOutputStream = new FileOutputStream(file);
            String str = "Welcome";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File write successfully...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        try {
            fileInputStream = new FileInputStream(file);
            int i = fileInputStream.read();
            while (i > 0) {
                System.out.print((char) i);
                i = fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
