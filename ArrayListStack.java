// The purpose of this program is to reverse a string using the ArrayBasedList as a stack

import java.util.*;

public class ArrayListStack {

    public String reverse (String input){

        Stack<Character> stack = new Stack<Character>();
        char[] charArray = input.toCharArray();

        
        for (int i = 0 ; i < charArray.length ; i++){
            stack.push(charArray[i]);
        }
        
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
    
        return reversed;
    }

    public static void main(String[] args) {
        ArrayListStack arrayList = new ArrayListStack();
        String input = "Celine";
        String reversed = arrayList.reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}