package Part2;
//- Create a Java program that reads a text file named "input.txt."
//   - Use FileReader and BufferedReader to read the contents of the file line by line.
//   - Print each line to the console.

import java.io.*;

public class ReadFile {
    public static void main(String[] args)  {
        FileReader in = null;
        try {
            in = new FileReader("E:\\IntroductionToProgramming\\Assigmnment5\\src\\input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("The file not found");
        }
        char buf[] = new char[1024];
        BufferedReader f = new BufferedReader(in);
        int i = 0;
        while (true){
            try {
                if (!(( i = f.read()) != -1)) break;
            } catch (IOException e) {
                System.out.println("There is an error in reading file");
            }
            System.out.print((char) i);

        }

    }
}
