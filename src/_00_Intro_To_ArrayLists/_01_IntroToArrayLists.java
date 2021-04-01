package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
        ArrayList<String> strings = new ArrayList<String>();

        // 2. Add five Strings to your list
strings.add("hi");
strings.add("how are you");
strings.add("it has been so long");
strings.add("since we last saw each other");
strings.add("It was a long long time ago I beleive.");
        // 3. Print all the Strings using a standard for-loop
//for(int i = 0; i < strings.size(); i++){
//    String s = strings.get(i);
//    
        // 4. Print all the Strings using a for-each loop

        // 5. Print only the even numbered elements in the list.
//    if(i%2==0) {
//        System.out.println(s);
//        }

        // 6. Print all the Strings in reverse order.
for(int i = strings.size()-1;i>=0; i--){
	String s = strings.get(i);
  System.out.println(s);

        // 7. Print only the Strings that have the letter 'e' in them.


}
    }
}
