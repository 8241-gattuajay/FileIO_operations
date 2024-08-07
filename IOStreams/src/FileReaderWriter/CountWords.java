package FileReaderWriter;

import java.io.*;

public class CountWords {
    public static void main(String[] args) throws IOException {
            File file = new File("C:\\Users\\ajay.gattu\\newProject3\\file2.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words =line.split(" ");
                count += words.length;
            }
            System.out.println("Number of words in the file: " + count);
}
}
