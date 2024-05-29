public class BinarySearch {

    public static int binarySearch (int a[] , int x){
        int low = 0;
        int high = a.length - 1;

        while(high >= low){
            int mid = (low + high) / 2; // the one in the slides is wrong

            if ( x == a[mid]){
                return mid;
            }

            else if (x > a[mid]) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public static int RecursiveBinarySearch (int arr[], int left, int right, int x){
        
            if (right >= left) {
                int mid = left + (right - left) / 2;
    
        
                if (arr[mid] == x){ // if element is found at the middle
                    return mid;
                }
    
                else if (arr[mid] > x) { // if element is less than the middle so the element is in the left side
                    return RecursiveBinarySearch(arr, left, mid - 1, x);
                }
    
                else{ // if element is more than the middle so the element is in the right side
                    return RecursiveBinarySearch(arr, mid + 1, right, x);
                }
            }
    
            return -1; // element is not present
        }
    
        public static void main(String args[]){
        
            int[] arr = {98,89,11,25,53};
            int x = 11;
    
            int result = RecursiveBinarySearch(arr, 0, arr.length - 1, x);    
            
            if (result == -1){
                System.out.println("Element not found in array");
            }

            else {
                System.out.println("Element founf at index: " + result);
            }

            //     int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            //     int x = 5;
        
            //     int result = binarySearch(a, x);
        
            //      if (result == -1){
            //     System.out.println("Element not found in array");
            //     }

            //     else {
            //     System.out.println("Element found at index: " + result);
            //     }
            // }
        }
}
    

