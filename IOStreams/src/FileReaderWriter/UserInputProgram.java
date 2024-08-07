package FileReaderWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputProgram {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String context = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("C:\\Users\\ajay.gattu\\newProject3\\user_input.txt");
        fileWriter.write(context);
        fileWriter.close();
    }
}
