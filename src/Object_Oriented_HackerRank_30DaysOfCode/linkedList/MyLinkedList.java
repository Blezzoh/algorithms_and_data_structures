package Object_Oriented_HackerRank_30DaysOfCode.linkedList;

/**
 * Created by blaise on 8/8/17.
 * custom integer's linked list
 */
public class MyLinkedList {
    Node head;
    int count;

    /**
     * @param head head/top of the linkedList
     */
    public MyLinkedList(Node head){
        this.head = head;
        this.count = 0;
    }

    /**
     * @param data data of the head of the linked list
     */
    public MyLinkedList(int data){
        this.head = new Node(data, null);
        this.count = 0;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getLastIndex() {
        return count;
    }

    public Node getHead(){
        return this.head;
    }

    /**
     * @return length of the linked list
     */
    public int size(){
        if(getHead() == null)
            return 0;
        else
            return getLastIndex() + 1;
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
     * indexes start from 0 just like arrays
     * @param index of the node to be returned
     * @return the node at index=@param index
     * constraint: index must be <= to getLastIndex
     */
    public Node getNode(int index){

        Node temp = getHead();
        if(index > getLastIndex()){
            return null;
        }
        for(int i=1 ; i <= index; i++) {
            temp = temp.getNext();
        }
        return temp;
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
        for (int i = 0; i < this.getLastIndex() - 1; i++) {
            temp = temp.getNext();
        }
        this.count--;
        temp.setNext(null);
    }

    public void printList(){
        if(this.getHead() == null){
            System.out.println("empty");
        }
        else {
            Node temp = getHead();
            while (temp.next != null) {
                System.out.print(temp.getData() + "-> ");
                temp = temp.getNext();
            }
            System.out.println(temp.getData());
        }
    }

    public static void main(String [] args){
        MyLinkedList list = new MyLinkedList(1);
        for(int i=2; i<11; i++){
            list.insert(i);
        }
        list.printList();
        list.remove();
        list.printList();
        System.out.println(list.get(list.getLastIndex()));
        System.out.println(list.empty());
    }

}
