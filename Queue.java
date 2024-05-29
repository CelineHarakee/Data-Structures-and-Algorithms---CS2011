// 6
public class Queue {

    Object a [];
    int n;
    int j;


    public Queue () {
        a = new Object[10];
        int n = 0;
        int j = 0;
    }

    public void enque (Object x) {
        if (n == a.length){
            resize();
        }

        a[(j + n) % a.length] = x;
    }

    public Object dequeue (){
        Object x = a[j];
        j = (j + 1) % a.length;
        n --;

        if (n <= a.length/3){
            resize();
        }

        return x;
    }

    public void resize(){
        Object [] b = new Object [2*n];

        for (int i = 0 ; i < n ; i ++){
            b[i] = a[(j+n)% a.length];
        }
        j = 0;
        a = b;
    }

    public String toString(){
        String output = "";
        for(int i=0; i<n; i++){
            output = output + a[(j + i)% a.length] + " ";
    }
    return output;
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.enque("Celine");
        q.enque("Jungkook");
        q.enque("Taehyung");

        // System.out.println(q.dequeue());
        System.out.println(q);

    }
}
