package FileReaderWriter;

import java.io.*;

public class BufferedReaderProgram {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ajay.gattu\\newProject3\\file2.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        try{
            while((line =bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IOException(e);
        }bufferedReader.close();
    }
}
