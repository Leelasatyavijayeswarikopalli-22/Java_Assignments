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
    public void delete(int val) {
        if (head == null) {
            return; // Empty list
        }

        // Case 1: Single node in the list
        if (head == tail && head.val == val) {
            head = null;
            tail = null;
            return;
        }

        // Case 2: Deleting the head node
        if (head.val == val) {
            head = head.next;
            tail.next = head; // Maintain circular link
            return;
        }

        // Case 3: Deleting any other node
        Node current = head;
        while (current.next != head) { // Stop when we loop back
            if (current.next.val == val) {
                // If deleting tail, update tail reference
                if (current.next == tail) {
                    tail = current;
                }
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
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
