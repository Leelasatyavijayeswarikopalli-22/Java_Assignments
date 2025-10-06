package Video_questions.DS.LinkedList;

public class DoublyLinked {
    public static void main(String[] args) {
LLD list=new LLD();
list.insertAtFirst(8);
list.insertAtFirst(6);
list.insertAtFirst(3);
list.insertAtLast(12);
list.insert(100,0);
list.deleteAtHead();
list.display();
list.displayrev();
    }
}
