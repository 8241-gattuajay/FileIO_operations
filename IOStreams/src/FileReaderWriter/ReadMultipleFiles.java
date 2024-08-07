package FileReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadMultipleFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ajay.gattu\\newProject3\\file2.txt");
        File file2 = new File("C:\\Users\\ajay.gattu\\newProject3\\file1.txt");
        File file3 = new File("C:\\Users\\ajay.gattu\\newProject3\\some_thing.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(file3));

        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            while ((line = bufferedReader2.readLine()) != null) {
                System.out.println(line);
            }
            while ((line = bufferedReader3.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
