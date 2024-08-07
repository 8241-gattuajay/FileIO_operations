package FileReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SkipOneFile {
    public static void main(String[] args) {
        File[] files = {new File("C:\\Users\\ajay.gattu\\newProject3\\file1.txt"), new File("C:\\Users\\ajay.gattu\\newProject3\\file2.txt"), new File("C:\\Users\\ajay.gattu\\newProject3\\some_thing.txt")};

        for(File file: files){
            if(file.getName().equals("file2.txt")){
                continue;
            }
            else{
                BufferedReader bufferedReader = null;
                try{
                    bufferedReader = new BufferedReader(new FileReader(file));
                    String line;
                    while((line = bufferedReader.readLine())!=null){
                        System.out.println(line);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
//                } finally {
//                    try {
//                        if (bufferedReader != null) {
//                            bufferedReader.close();
//                        }
//                    } catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//                }
            }
        }
    }
}
}
