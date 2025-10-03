package Video_questions.DS.LinkedList;

public class LL {
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

    public void insertAtFirst( int value) {
        Node node = new Node(value);
        node.next=head;
       head=node;
        if(tail==null){              //this means this is the first node...
        tail = head;
    }
    size++;
}
public void insertAtLast(int value){
    if(tail==null){
        insertAtFirst(value);
        return;
    }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
}
public void insert(int value,int index){
        if(index==0){
            insertAtFirst(value);
            return;
        }
        if(index==size){
            insertAtLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
}
public int deleteFirst(){

        if(head==null){

            return -10000;
        }
    int val=head.value;

    head=head.next;
        size--;
        return val;
}
public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
}
public int deleteLast(){
        if(size<=1){
          return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
}
public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
           return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
}
public Node find(int value){
        Node node= head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
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

