package Video_questions.DS.Queues;

public class code {
    public static void main(String[] args) throws Exception{
        Queue queue=new Queue();
        queue.insert(1);
        queue.insert(10);
        System.out.println("Removed item is : "+ queue.remove());
        queue.display();
        System.out.println("\nThe item at the front : "+queue.front());
    }
}
