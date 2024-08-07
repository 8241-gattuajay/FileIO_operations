package FileReaderWriter;

import java.io.*;

public class TofindSpecificWord {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ajay.gattu\\newProject3\\file2.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line ;
        try{
            while((line = bufferedReader.readLine())!=null){
                if(line.matches("Gattu")){
                    System.out.println("Found the word Gattu in the file");
                }else{
                    System.out.println("Word not found");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
