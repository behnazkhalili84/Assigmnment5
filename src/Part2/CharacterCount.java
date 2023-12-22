package Part2;
//Implement a method that takes a String as input and counts the total number of characters (excluding whitespaces).
//   - Apply this method to each line read from the file and print the character count for each line.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCount {
    public static void main(String[] args) {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;

        // Read lines from the file until the end of the file is reached
        while (true){
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                System.out.println("There is an error in reading file");
            }
            System.out.println( " The number of character for this line is:"+ characterCount(line));
        }

    }
    public static int characterCount(String str){
        int count = 0;
        for (char c:str.toCharArray()){
            if(!Character.isWhitespace(c)){
                count++;
            }
        }
        return count;
    }
}
