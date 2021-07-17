package MyPractiseJune;

import java.util.ArrayList;

public class ArraysInSquareBraces {
    public static void main(String[] args) {
        ArrayList al=new ArrayList(){
            {
                add("Mango");
                add("Banana");
                add("Pineapple");
            }
        };
        System.out.println(al);
    }
}
