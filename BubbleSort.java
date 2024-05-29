public class BubbleSort { 

    public static void bubbleSort(int[]a){ // dana's code i was absent
        for (int j=0;j<a.length-1;j++){
            for(int i=0;i<a.length-1-j;i++){ //-j because no need to loop over sorted elemnts extra work
                if(a[i]>a[i+1]){
                     int temp=a[i+1];
                     a[i+1]=a[i];
                     a[i]=temp;
                 }
             }
        }
    }

    public static void BubbleSortDecreasing(int a[]){ // my code
        for (int j = 0 ; j < a.length - 1 ; j++){
            for(int i = 0 ; i < a.length - 1 - j ; i++){ 
                if(a[i] < a[i + 1]){
                     int temp = a[i + 1];
                     a[i + 1] = a[i];
                     a[i] = temp;
                 }
             }
        }
    }

    public static void BestCaseBubbleSort (int a[]){
        // to check if there was any swapping, if there was no swapping then it means the array is srted
        boolean swap = false; // initialize swap to false because we assume there were no swaps done... then we check  :)
            
        for (int j = 0; j < a.length - 1; j++) { // controls the number of iterations through the array
            boolean flag = false; // set flag
            for (int i = 0; i < a.length - 1 - j; i++) { // swaps elements that are next to each other
                if (a[i] > a[i + 1]) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    swap = true; 
                }
            }
            if (!swap) {
                break; // if there was no swapping then it means the array is srted
            }
        }
    }
            
public static void main(String args[]){ 
    int arr[] = {2,5,8,3,7,1,9,4,6,0};
    BestCaseBubbleSort(arr); // call any function, mine or dana's, mine is decreasing , dana's increasing
    
    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i] + " ");
    }
}   
}
