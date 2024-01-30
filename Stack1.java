// using stacks to reverse a sentence
import java.util.Scanner;
import java.util.Stack;

public class Stack1{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scan.nextLine();

        String words[] = input.split(" "); // built in function, whenever it finds a space, it cuts it

        Stack<String> s = new Stack<String>();
        
        for (int i=0;i<words.length;i++) {
            s.push(words[i]);
        }

        for (int i = 0 ; i < words.length ; i++){
            System.out.println(s.pop() + " ");
        }

    }
}
