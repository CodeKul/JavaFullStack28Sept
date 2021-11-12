package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) throws IOException {

        File file = new File("/home/vaibhav/workspace/Sept28Java/src/filehandling/test.txt");
        System.out.println(file.isFile());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.isDirectory());
        System.out.println(file.getPath());

        File file1 = new File("/home/vaibhav/workspace/Sept28Java/src/filehandling/sample.txt");
        boolean flag = file1.createNewFile();
        System.out.println(flag);
        if(file1.createNewFile()){
            System.out.println("File created");
        }else {
            System.out.println("Already exist");
        }

//        boolean dir = new File("/home/vaibhav/workspace/Sept28Java/newDir").mkdirs();
//        System.out.println(dir);

        File file2 = new File("/home/vaibhav/workspace/Sept28Java/newDir/sample2.txt");
        boolean f = file2.createNewFile();
        System.out.println(f);

        System.out.println();
        File file3 = new File("/home/vaibhav/workspace/Sept28Java");
        String[] arr = file3.list();
        for (String ar:arr) {
            System.out.println(ar);
        }
    }
}
