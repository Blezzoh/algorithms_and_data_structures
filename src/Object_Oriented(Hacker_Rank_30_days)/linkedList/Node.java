public class Node{
    int data;
    Node next;
    
    /*@param data classes data
     *@param next classes next Node
    */
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    public int getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }
    /*
    * @param newNext classes next Node
    */
    public void setNext(Node newNext){
        this.next = newNext();
    }
    /*@param newData classes data
    */
    public void setData(int newData){
        this.data = newData;
    }
}
