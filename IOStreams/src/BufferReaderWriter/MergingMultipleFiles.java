package BufferReaderWriter;

import java.io.*;

public class MergingMultipleFiles {
    public static void main(String[] args) throws IOException {
        File[] files = {new File("file1.txt"), new File("file2.txt"), new File("file3.txt")};

        for (File file : files) {
            if (file.canRead()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("merged_feedback.txt"));
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
