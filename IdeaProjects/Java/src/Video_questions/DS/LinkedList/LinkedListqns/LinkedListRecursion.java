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
        head=insertRec(value,index,head);
    }
   private Node insertRec(int val,int index,Node node){
        if(node==null){
            return new Node(val);
        }
        if(index==0){
            Node temp=new Node(val);
            temp.next=node;
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
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
}
public class LinkedListRecursion {
    public static void main(String[] args) {
        LLR l=new LLR();
       l.insertRec(12,0);
       l.insertRec(11,1);
       l.insertRec(10,1);
        l.display();
    }
}