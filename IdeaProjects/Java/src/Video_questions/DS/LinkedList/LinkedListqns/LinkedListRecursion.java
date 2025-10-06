package Video_questions.DS.LinkedList.LinkedListqns;

class LLR {
    private class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    void insertRec(int value,int index){
        if(head==null){
            return;
        }
        head=insertRec(value,index,head);
    }
   private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val);
            temp=node.next;
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node);
        return node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void insertAtFirst( int value) {
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null){              //this means this is the first node...
            tail = head;
        }
        size++;
    }
}
public class LinkedListRecursion {
    public static void main(String[] args) {
        LLR l=new LLR();
        l.insertAtFirst(1);
        l.insertAtFirst(2);
//        l.insertRec(12,1);
        l.display();
    }
}