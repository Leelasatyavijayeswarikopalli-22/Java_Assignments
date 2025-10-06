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
       Node newNode=new Node(value);
       if(head==null){
           head=newNode;
           tail=newNode;
           return;
       }
       head.previous=newNode;
       newNode.next=head;
       head=newNode;
       size++;
   }
   public void insertAtLast(int val){
       Node newNode=new Node(val);
       if(head==null){
           head=newNode;
           tail=newNode;
           return;
       }
       tail.next=newNode;
       newNode.previous=tail;
       tail=newNode;
       size++;
}
   public void insert(int val,int index){
       Node node=new Node(val);
       Node temp=head;
       if(temp==null||index==0){
           insertAtFirst(val);
           return;
       }
       for(int i=0;i<index;i++){
           temp=temp.next;
       }
       node.next = temp.next;
       if(temp.next!=null){
           temp.next.previous=node;
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
   public void deleteAtHead(){
       if(head==null){
           return;
       }
       if(head.next!=null) {
           head.next.previous = null;
       }
       if(head==tail){
           tail=tail.previous;
           head=head.next;
           return;
       }
       head=head.next;
       size--;
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
