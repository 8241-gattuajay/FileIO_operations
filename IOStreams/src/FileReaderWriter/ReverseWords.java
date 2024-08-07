package FileReaderWriter;

import java.io.*;

public class ReverseWords {
    public static void main(String[] args) throws IOException {
        File file= new File("C:\\Users\\ajay.gattu\\newProject3\\some_thing.txt");
       try(FileReader fileReader = new FileReader("C:\\Users\\ajay.gattu\\newProject3\\file2.txt")){
        FileWriter fileWriter = new FileWriter(file);
        int i;
        StringBuilder rev = new StringBuilder();
        while ((i = fileReader.read()) != -1) {
            rev.insert(0, (char) i);
        }
        fileWriter.write(rev.toString());
        fileWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}
