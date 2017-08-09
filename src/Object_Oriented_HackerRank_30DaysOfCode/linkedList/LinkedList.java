package Object_Oriented_HackerRank_30DaysOfCode.linkedList;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by blaise on 8/8/17.
 */
public class LinkedList {
    Node head;
    int count;

    /**
     * @param head head/top of the linkedList
     */
    public LinkedList(Node head){
        this.head = head;
        this.count = 0;
    }

    /**
     * @param data data of the head of the linked list
     */
    public LinkedList(int data){
        this.head = new Node(data, null);
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public Node getHead(){
        return this.head;
    }

    /**
     * @return length of the linked list
     */
    public int size(){
        return getCount() + 1;
    }

    /**
     *
     * @param data new node's data
     */
    public void insert(int data){
        if(this.getHead() != null) {
            Node temp = head;
            Node latest = new Node(data, null);
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(latest);
        }
        else
            head = new Node(data, null);

        this.count++;

    }

    /**
     * indexes start from 0 just like arrays
     * @param index of the node to be returned
     * @return data of the node at index=@param index
     */
    public int get(int index){

        Node temp = getHead();
        for(int i=1 ; i <= index; i++) {
            temp = temp.getNext();
        }
        return temp.getData();
    }

    /**
     * @return true if the list is empty
     */
    public boolean empty(){
        return this.head == null;
    }

    /**
     * removes the last element of the list
     */
    public void remove(){
        Node temp = getHead();
        for (int i = 0; i < this.getCount() - 1; i++) {
            temp = temp.getNext();
        }
        this.count--;
        temp.setNext(null);
    }
    public void printList(){
        Node temp = getHead();
        while(temp.next != null){
            System.out.print(temp.getData() + "-> ");
            temp = temp.getNext();
        }
        System.out.println(temp.getData());
    }
    public static void main(String [] args){
        LinkedList list = new LinkedList(1);
        for(int i=2; i<11; i++){
            list.insert(i);
        }
        list.printList();
        list.remove();
        list.printList();
        System.out.println(list.get(list.getCount()));
    }

}
