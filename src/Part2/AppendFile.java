package Part2;
//- Open the "output.txt" file created in Task 3 in append mode.
//   - Add the following lines to the end of the file:
//     - "Appending new line."
//     - "File I/O without buffers."

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("output.txt.",true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
            bufferedWriter.newLine();
            bufferedWriter.write("- \"-Appending new line.\"");
            bufferedWriter.newLine();
            bufferedWriter.write("- \"File I/O without buffers.\"");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
