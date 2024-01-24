import java.util.Scanner;
import java.util.Stack;

public class Stack2 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scan.nextLine();
        char word[] = input.toCharArray(); 

        Stack<Character> s = new Stack<Character>();
        
        for (int i=0;i<word.length;i++) {
            s.push(word[i]);
        }

        for (int i = 0 ; i < word.length ; i++){
            System.out.print(s.pop() + ""); // print to make it in one line
        }

    }
}