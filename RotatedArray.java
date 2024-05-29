// 7
// implement a method rotate (a,r) that "rotates" the array a so that a[i] moves to a[(i+r)mod a.length], for all i ∈ {0, .... , a.length} 

import java.util.Arrays;

public class RotatedArray {
    Object a[];
    int r;

    public RotatedArray (){
        a = new Object[3];
        r = 0;
    }
 
    public void rotate (Object a[] , int r){

        int length = a.length;
        Object [] b = new Object[length]; // new array to store the rotated array

        for (int i = 0 ; i < length ; i ++){
            b[(i+r)%length] = a[i]; // index after rotation 
        }

        for (int i = 0 ; i < length ; i ++){
            a[i] = b[i]; // copy elements from array b to array a
        }
    }

    public String toString(Object a[]){
        String output = "";
        for(int i = 0 ; i < a.length ; i++){
            output = output + a[i] + " ";
        }
        return output;
    }
   

    public static void main(String[] args) {
        RotatedArray rotatedArr = new RotatedArray();
        
        Object[] array = {"Celine" , "Jamal" , "Al Harake"};
        System.out.println("Original array: " +  rotatedArr.toString(array)); // no idea why toString is not doing the job
        
        rotatedArr.rotate(array ,1); // r is the numbr of rotations
        System.out.println("Rotated array: " + rotatedArr.toString(array));
    }
}
