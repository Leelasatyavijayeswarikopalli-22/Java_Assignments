package Video_questions.DS.LinkedList;

public class LLD {
   private class Node{
        int  val;
        Node next;
        Node previous;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node previous){
            this.val=val;
            this.next=next;
            this.previous=previous;
        }
    }
    private Node head;
   private Node tail;
   private int size;
   public void insertAtFirst(int value){
       Node node=new Node(value);
       node.next=head;
       node.previous=null;
       if(head!=null) {
           head.previous = node;
       }
       if(tail==null){
           tail=head;
       }
       head=node;
       size++;
   }
   public void insertAtLast(int val){
Node node=new Node(val);
if(tail!=null) {
    tail.next = node;
}

node.next=null;
node.previous=tail;
tail=node;
if(head==null){
    node.previous=null;
    head=node;
    return;
}
size++;
   }
   public void insert(int val,int index){
       Node node=new Node(val);
       Node temp=head;
       if(temp==null){
           insertAtFirst(val);
           return;
       }
       for(int i=0;i<index;i++){
           temp=temp.next;
       }
       node.next = temp.next;
       if(temp.next!=null) {
           temp.next.previous = node;
       }
       temp.next=node;
       node.previous=temp;
       size++;

   }
   public void displayrev(){
       if(tail==null){
           tail=head;
       }
       Node node=tail;
       System.out.print("null->");
       while(node!=null){
           System.out.print(node.val+"->");
           node=node.previous;
       }
       System.out.println("null");
   }
   public void display(){
       Node node=head;
       System.out.print("null->");
      while(node!=null){
           System.out.print(node.val+"->");
           node=node.next;
       }
       System.out.println("null");
   }

}
