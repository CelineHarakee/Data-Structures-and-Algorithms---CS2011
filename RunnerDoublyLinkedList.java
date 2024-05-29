import doublylinkedlist.DequeDoublyLinkedList;
import doublylinkedlist.Node;

public class RunnerDoublyLinkedList {
    public static void main(String args []) {

        DequeDoublyLinkedList deque = new DequeDoublyLinkedList();

        // adding
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addFirst(4);

        System.out.println("Deque:" + deque.get(0)  + " " + deque.get(1) + " " + deque.get(2) + " " + deque.get(3));

        // removing
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removal:" + deque.get(0)  + " " + deque.get(1)); // i know i shouldnt specify how many gets...🙄
    }
}
