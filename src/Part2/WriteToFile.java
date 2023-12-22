package Part2;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//- Create a new text file named "output.txt."
//   - Write the following lines to the file:
//     - "Hello, this is line 1."
//     - "Java File I/O is interesting!"
//     - "End of the assignment."
public class WriteToFile {
    public static void main(String[] args) {
        Scanner sc = null;
        String input1 = "- \" Hello, this is line 1.\"";
        String input2 =  "- \"-Java File I/O is interesting!\"";
        String input3 = "- \"-End of the assignment.\"";
        try {
            FileWriter fileWriter = new FileWriter("output.txt.");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(input1);
            bufferedWriter.newLine();

            bufferedWriter.write(input2);
            bufferedWriter.newLine();

            bufferedWriter.write(input3);
            bufferedWriter.close();

            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
