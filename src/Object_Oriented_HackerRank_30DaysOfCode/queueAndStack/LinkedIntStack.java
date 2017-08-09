package Object_Oriented_HackerRank_30DaysOfCode.queueAndStack;

/**
 * Created by Blaise on 8/9/17.
 * Integer Stack implement on top of custom linked list
 */
import Object_Oriented_HackerRank_30DaysOfCode.linkedList.*;

import java.util.NoSuchElementException;

public class LinkedIntStack {
    MyLinkedList stack;

    public LinkedIntStack(int data){
        this.stack = new MyLinkedList(data);
    }

    public MyLinkedList getStack() {
        return stack;
    }

    public void setStack(MyLinkedList stack) {
        this.stack = stack;
    }

    public int size(){
        return getStack().size();
    }
    public boolean empty(){
        return getStack().empty();
    }

    // return the top of the stack(tail of the list)
    public int peek() throws NoSuchElementException{
        int last = getStack().getLastIndex();
        if(getStack().getHead() == null)
            throw new NoSuchElementException("stack is empty");
        else{
            return getStack().get(last);
        }
    }

    // removes and return the of the stack(tail of the list)
    public int pop() throws NoSuchElementException{
        int last = getStack().getLastIndex();
        if(getStack().getHead() == null)
            throw new NoSuchElementException("stack is empty");
        else{
            int num = getStack().get(last);
            getStack().remove();
            return num;
        }
    }
    // add data at the top of the stack(tail of the list)
    public void push (int data){
        getStack().insert(data);
    }
    public void printStack(){
        StringBuilder s = new StringBuilder();
        if(getStack().getHead() == null){
            System.out.println("empty");
        }
        else {
            Node temp = getStack().getHead();
            int [] data = new int[getStack().size()];
            int i = 0;
            while (temp.getNext() != null) {
                data[i] = temp.getData();
                temp = temp.getNext();
                i++;
            }
            data[i] = temp.getData();
            for (int j = getStack().getLastIndex(); j >=0 ; j--) {
                s.append(data[j]);
                if(j >0)
                    s.append(" -> ");
            }
            System.out.println(s.toString());
        }

    }
    public static void main(String[] args) {
        LinkedIntStack s = new LinkedIntStack(0);
        for (int i = 1; i < 10; i++) {
            s.push(i);
        }
        s.printStack();
        System.out.printf("pop %d, size after pop %d\n", s.pop(), s.size());
        s.push(10);
        System.out.println("push 10, size after " + s.size());
        s.printStack();
        System.out.println("checking LIFO with peek,\npeek " + s.peek());
        System.out.println("size after peek and list,\nsize " + s.size());
        s.printStack();
    }

}
