package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCollectionUtil {
    public static void main(String[] args) {
        print1();
        System.out.println();
        print2();
        System.out.println();
    }

    public static ArrayList<String> met(ArrayList<String> list, int number){
        for (int i = 0; i < list.size() ; i++) {
            int length = list.get(i).length();
            if (length == number) {
                list.set(i,"*");
            }
        }
        return list;
    }

    public static ArrayList<String> delete(ArrayList<String> delete, int number){
        for (int i = 0; i < delete.size() ; i++) {
            int length = delete.get(i).length();
            if (length == number) {
                delete.remove(i);
            }
        }
        return delete;
    }

    public static void print1(){
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        met(list1,4);
        for (String text1 : list1)
        {
            System.out.print(text1 + " ");
        }
    }

    public static void print2(){
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        delete(list1,4);
        for (String text1 : list1)
        {
            System.out.print(text1 + " ");
        }
    }

}
