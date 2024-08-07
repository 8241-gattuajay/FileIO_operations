package FileReaderWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram {
    public static void main(String[] args) throws IOException {
        File file2 = new File("C:\\Users\\ajay.gattu\\newProject3\\file1.txt");
        FileWriter fileWriter = new FileWriter(file2);
        fileWriter.write("New content added from AJAY GATTU");
        fileWriter.close();

        FileReader fileReader = new FileReader(file2);
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
