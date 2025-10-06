package Video_questions.DS.LinkedList;
//head doesn't change in circular linked list
public class LLC {
    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
  private  Node tail;
  private  Node head;
    int size;
    public void insertAfterTail(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }
    public void delete(int val){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.val==val){
            head=head.next;
            tail.next=head;
           return;
        }else{
            if(tail==head){
                head=null;
                return;
            }
        }

        do{
            if(node.val==val){
                node.next=node.next.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }
    public void display(){
        Node node=head;
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
           do{
                System.out.print(node.val+"->");
                node=node.next;
            } while(node!=head);
    }
}
