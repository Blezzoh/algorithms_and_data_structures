package Object_Oriented_HackerRank_30DaysOfCode.queueAndStack;
import Object_Oriented_HackerRank_30DaysOfCode.linkedList.*;

import java.util.NoSuchElementException;

/**
 * Created by Blaise on 8/9/17.
 * uses own created linked list
 */
public class LinkedIntQueue {
    MyLinkedList queue;

    public LinkedIntQueue(int data) {
        this.queue = new MyLinkedList(data);
    }

    public MyLinkedList getQueue() {
        return queue;
    }

    public void setQueue(MyLinkedList queue) {
        this.queue = queue;
    }


    public int size() {
        return getQueue().size();
    }

    public boolean empty() {
        return getQueue().empty();
    }

    /**
     * adds an int at the tail of the queueAndStack
     *
     * @param data int to add
     */
    public void add(int data) {
        getQueue().insert(data);
    }

    /**
     * peek and element return top of the queueAndStack
     */
    public int peek() {
        return getQueue().getHead().getData();
    }

    public int element() throws NoSuchElementException {
        Node top = getQueue().getHead();
        if (top == null)
            throw new NoSuchElementException("queueAndStack is empty");
        else
            return top.getData();
    }

    /**
     * remove and poll return top of the queueAndStack
     */
    public int remove() throws NoSuchElementException {
        Node top = getQueue().getHead();
        if (top == null)
            throw new NoSuchElementException("queueAndStack is empty");
        else {
            if (getQueue().getHead().getNext() != null) {
                Node newTop = getQueue().getHead().getNext();
                getQueue().setHead(newTop);
            } else {
                getQueue().setHead(null);
            }
            top.setNext(null);
            return top.getData();
        }
    }

    public int poll() {
        Node top = getQueue().getHead();
        if (getQueue().getHead().getNext() != null) {
            Node newTop = getQueue().getHead().getNext();
            getQueue().setHead(newTop);
        } else {
            getQueue().setHead(null);
        }
        top.setNext(null);
        return top.getData();
    }

    public void printQueue(){
        getQueue().printList();
    }
    public static void main(String[] args) {
        LinkedIntQueue k = new LinkedIntQueue(1);
        // checking size
        System.out.printf("size %d\n", k.size() );
        System.out.println("empty? " + k.empty());
        System.out.printf("queueAndStack: ");
        k.printQueue();
        // checking peek and element

        System.out.printf("peek %d\n", k.peek());

        // checking poll and element
        try {
            System.out.printf(" poll %d, element %d\n", k.poll(), k.element());
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }

        System.out.printf("queueAndStack: ");
        k.printQueue();

        // checking add and remove
        k.add(1);
        System.out.println("peek " + k.peek());
        System.out.printf("remove %d\n", k.remove());

        try {
            System.out.printf("remove %d", k.remove());
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
        System.out.println("empty? " + k.empty());

        // checking print
        for (int i = 0; i < 10; i++) {
            k.add(i);
        }
        System.out.printf("queueAndStack: ");
        k.printQueue();
        System.out.printf("remove first three\nqueu: ");
        for (int i = 0; i <3 ; i++) {
            k.remove();
        }
        k.printQueue();
        System.out.printf("FIFO check using peek, \npeek %d\n", k.peek());
    }
}
