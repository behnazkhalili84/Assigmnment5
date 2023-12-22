package Part2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//- Implement a method that takes a filename and a String as input and writes the String to the specified file without using buffers.
//   - Test this method by writing a custom message to a new file named "custom.txt."
public class Chalenges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = " ";
        System.out.println("Please Enter your file name");
        String name = scanner.nextLine();

        System.out.println("Please enter your String");
        str = scanner.nextLine();
        try {
            writeString(name,str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void writeString(String fileName,String str) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(str);
        fileWriter.close();

    }
}
