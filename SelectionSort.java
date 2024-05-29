public class SelectionSort {
    
        public static void IncreasingSelectionSort (int a[]) {
            for (int j = 0 ; j < a.length ; j++){ // n
                int min = a[j];
                int minIndex = j;
        
                for (int i = j ; i < a.length ; i++){ // n; n inside n is n^2 
                    if (a[i] < min) {
                        min = a[i];
                        minIndex = i;
                    }
                }
                int temp = a[j];
                a[j] = min;
                a[minIndex] = temp;
            }
        }

        
        public static void DecreasingSelectionSort (int a[]) {
            for (int j = 0; j < a.length; j++) {
                int max = a[j];
                int maxIndex = j;
            
                for (int i = j; i < a.length; i++) {
                    if (a[i] > max) {  
                        max = a[i];
                        maxIndex = i;
                    }
                }
                int temp = a[j];
                a[j] = max;
                a[maxIndex] = temp;
            }
        }

        public static void SortingStrings (String a[]) {
            for (int i = 0; i < a.length; i++) {
                int minIndex = i;
    
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j].compareTo(a[minIndex]) < 0) { // compareTo is a method to sort strings
                        minIndex = j;
                    }
                }
    
                String temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }

        public static void main(String[] args) {
            int arr[] = {6,3,2,8,6,1,9,4};
            IncreasingSelectionSort(arr);
    
            System.out.println("Increasing: ");
            for (int i = 0 ; i < arr.length ; i++){
                System.out.print(arr[i] + " ");
            }

            DecreasingSelectionSort(arr);
    
            System.out.println("\nDecreasing: ");
            for (int i = 0 ; i < arr.length ; i++){
                System.out.print(arr[i] + " ");
            }

            String arr2[] = {"y" , "a" , "l" , "c" , "z" , "k" , "v" , "j"};
            SortingStrings(arr2);

            System.out.println("\nAlphabetical Order:");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
        }
    }

