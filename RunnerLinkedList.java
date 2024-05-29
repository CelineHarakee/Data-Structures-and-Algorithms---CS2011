import linkedlist.Node;
import linkedlist.LinkedList;

public class RunnerLinkedList {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();
        stack.push("Celine");
        stack.push("Jungkook");
        stack.push("Taehyung");

        System.out.println(stack.pop()); // Taehyung
        System.out.println(stack.pop()); // Jungkook
        System.out.println(stack.pop()); // Celine
        System.out.println(stack.pop()); // null cuz end of stack
        System.out.println(stack.pop()); // null cuz end of stack

        ////////////////////////////////////

        LinkedList queue = new LinkedList();
        queue.enqueue("Celine");
        queue.enqueue(2004);
        queue.enqueue("Effat University");

        System.out.println(queue.dequeue()); // Celine
        System.out.println(queue.dequeue()); // 2004
        System.out.println(queue.dequeue()); // Effat University
        System.out.println(queue.dequeue()); // null cuz end of queue
    }
}
