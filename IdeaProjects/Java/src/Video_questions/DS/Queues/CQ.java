package Video_questions.DS.Queues;

public class CQ {
    public static void main(String[] args) throws Exception {
        CircularQueue cq=new CircularQueue();
        cq.insert(13);
        cq.insert(12);
        cq.insert(11);
        cq.insert(12);
        cq.insert(11);
        cq.remove();
        cq.insert(11);
        cq.display();
        System.out.println("\n"+cq.front());
    }
}
