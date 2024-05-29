// 3

import java.util.*;

public class BracketMatch {

    public boolean opened (char bracket){
        return bracket == '{' || bracket == '(' || bracket == '[';
    }

    public boolean closed (char bracket) {
       return bracket == '}' || bracket == ')' || bracket == ']';

    }

    public boolean matching (String s1){
        
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0 ; i < s1.length() ; i ++){
            char c = s1.charAt(i);

            if (opened(c)){
                stack.push(c);
            }

            else if (closed(c)){
                if (stack.isEmpty()){
                    return false;
                }
                
                char poppedBracket = stack.pop();
                
                if (!((poppedBracket == '{'  && c == '}') || (poppedBracket == '('  && c == ')') || (poppedBracket == '['  && c == ']'))){ // !, if (not)
                    return false;
                }
            }
    }
    return stack.isEmpty();
    }

    public static void main(String args[]) {
        String s1 = "{([])}";

        BracketMatch bracketMatch = new BracketMatch();

        System.out.println("Brackets matched: " + bracketMatch.matching(s1));
    }
}
