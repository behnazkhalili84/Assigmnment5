package Part1;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Defining arrayList
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("apple,");
        wordList.add("banana,");
        wordList.add("orange,");
        wordList.add("grape,");
        wordList.add("kiwi");
        for (int i = 0; i < wordList.size();i++){
            System.out.print(wordList.get(i));
        }
        wordList.add(",pear");
        wordList.remove(2);
        boolean isConsist = wordList.contains("orange,");
        System.out.println();
        System.out.println("orange exist is : " + isConsist);
        for (int i = 0; i < wordList.size();i++){
            System.out.print(wordList.get(i));
        }



    }

}
