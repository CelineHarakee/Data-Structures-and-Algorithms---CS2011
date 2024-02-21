// The purpose of this program is to reverse a string using the ArrayBasedList as a stack

import java.util.*;

public class ArrayListStack {
    Object arr[];
    int n;

    public ArrayListStack() {
        arr = new Object[10];
        n = 0;

    }
    public void add(int i, Object x){
        if(n == arr.length){
            resize();
        }

        for(int j = n; j > i ;j--) {
            arr[j] = arr[j-1];
        }
        arr[i] = x;
        n++;
    }

    public Object remove(int i){

        Object x = arr[i];
        for(int j = i; j < n -1;j++) {
            arr[j] = arr[j+1];
        }
        n--;

        if(n < arr.length){
            resize();
        }
        return x;
    }

    public void resize(){
        Object arr2[] = new Object[n*2];

        for(int i = 0; i < n;i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

        public void push (Object x)
        {
            add (n,x);
        }

        public Object pop()
        {
            return remove (n - 1);
        }

        public void separating (String inputString){
            
            String[] word  = inputString.split(" ");

            for (int i = 0 ; i < word.length ; i ++){
                push(word[i]);
            }

            for (int i = 0 ; i < word.length ; i ++){
                System.out.print(pop() + " ");
            }
        }

        public static void main(String[] args) {

            String inputString = "My name is Celine";

            ArrayListStack arrayList = new ArrayListStack();
    
            arrayList.separating(inputString);
        }

}
