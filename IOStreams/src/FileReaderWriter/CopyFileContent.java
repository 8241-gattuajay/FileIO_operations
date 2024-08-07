package FileReaderWriter;

import java.io.*;

public class CopyFileContent {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ajay.gattu\\newProject3\\file2.txt");
        //File file2 = new File("C:\\Users\\ajay.gattu\\newProject3\\file1.txt");

        FileReader fileReader = new FileReader(file);
 //       FileWriter fileWriter = new FileWriter(file2);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        int i;
        while((i=fileReader.read())!=-1){
            System.out.print((char)i);
        }
        fileReader.close();
    }
}
