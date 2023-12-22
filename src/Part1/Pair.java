package Part1;
/*    - Create a generic class called `Pair` that stores a pair of elements.
   - Instantiate a `Pair` with an Integer and a String.
   - Print the elements of the `Pair`.*/

import java.util.ArrayList;

public class Pair<E,F> {
    private E first;
    private F second;

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public F getSecond() {
        return second;
    }

    public void setSecond(F second) {
        this.second = second;
    }

    public Pair(E first, F second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
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


        System.out.println("**********Question3 ********************");
        Pair<Integer,String> pairStr = new Pair<>(39,"Behnaz age");
        System.out.println("First element:" + pairStr.getFirst());
        System.out.println("Second element: " + pairStr.getSecond());

        System.out.println("**********Question4 ********************");
        Pair<Double,Double> pairDouble = new Pair<>(50.2,25.3);
        System.out.println("First element:" + pairDouble.getFirst());
        System.out.println("Second element: " + pairDouble.getSecond());

        System.out.println();

        ArrayList<Pair> pairArrayList = new ArrayList<Pair>();
        pairArrayList.add(pairStr);
        pairArrayList.add(pairDouble);

        System.out.println("**********************Testing arrayList with pairArrayList*****************");
        arraylist(pairArrayList);
        System.out.println();
        System.out.println("**********************Testing arrayList with wordList*****************");
        arraylist(wordList);


    }
    public static void arraylist(ArrayList<?> arrayList){
        for (int i = 0; i < arrayList.size();i++){
            System.out.print(arrayList.get(i));
        }
    }
}
