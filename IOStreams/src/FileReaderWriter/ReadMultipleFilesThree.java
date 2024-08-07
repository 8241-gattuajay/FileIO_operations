package FileReaderWriter;

import java.io.*;

public class ReadMultipleFilesThree {
    public static void main(String[] args) throws FileNotFoundException {
        File[] files = {new File("C:\\Users\\ajay.gattu\\newProject3\\file1.txt"), new File("C:\\Users\\ajay.gattu\\newProject3\\file2.txt")};

        for (File file : files) {
            if (file.canRead()) {
                BufferedReader input = null;
                try {
                    input = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = input.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } finally {
                    try {
                        if (input != null) {
                            input.close();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
