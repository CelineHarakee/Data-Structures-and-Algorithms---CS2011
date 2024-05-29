// 4

public class ArrayBasedList {
        //fields
        Object []arr; //object general datatype, can store anything
        int n;
    
        //constructor for initial value
        public ArrayBasedList(){
            arr = new Object[10];  //initial number, better start with small num
            n = 0;                //count of elements because didnt add anything yet
        }
    
        public void set(int i, Object x){
            arr[i] = x;
        }
    
        public Object get(int i){
            return arr[i];
        }
    
        public int size(){
            return n;
        }
    
        public void add(int i, Object x){
            //check is array is full
            if(n == arr.length){
                resize();
            }
    
            //shifting
            for(int j = n; j > i ;j--) {
                arr[j] = arr[j-1];
            }
            arr[i] = x;
            n++;
        }
    
        public Object remove(int i){
            //store in a variable
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
    
            //copy elements to expanded array
            for(int i = 0; i < n;i++){
                arr2[i] = arr[i];
            }
            //define that this array is the new one
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

        public static void main(String[] args) {
            ArrayBasedList list = new ArrayBasedList();
            list.add(0, "Mohammad");
            list.add(0, "Layal");
            list.add(1, "Celine");
            list.add(1, "Dana");
            list.add(0, "Jouri");

        for (int i = 0 ; i < list.size() ; i ++){
            System.out.println(list.get(i));
        }

        list.remove(4);
        System.out.println("After removing: ");

        for (int i = 0 ; i < list.size() ; i ++){
            System.out.println(list.get(i));
        }

        list.push("A");
        list.push("B");
        list.push("C");
       

        System.out.println("After popping: ");
        System.out.println(list.pop());
        



        }
    }

    
    
    
    