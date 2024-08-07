package BufferReaderWriter;

import java.io.*;

public class LargeDataFileProcessing {
    public static void main(String[] args) {
        File inputfile = new File("transactions.txt");
        File outputfile = new File("ajay.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputfile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputfile))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split(",");

                String transactionID = words[0];
                String customerID = words[1];
                double transactionAmount;
                try {
                    transactionAmount = Double.parseDouble(words[2]);
                } catch (NumberFormatException e) {
                    continue;
                }
                String date = words[3];
                if (transactionAmount > 100) {
                    bufferedWriter.write(transactionID + "," + customerID + "," + transactionAmount + "," + date);
                    bufferedWriter.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}