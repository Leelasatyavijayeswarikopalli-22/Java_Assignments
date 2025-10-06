package Video_questions.DS.Queues;

public class Queue {
    protected int[] data;
    private static final int DEFAULT_SIZE=5;
    public Queue(){
        this(DEFAULT_SIZE);
    }
    public Queue(int size){
        this.data=new int[size];
    }
    int end=-1;
    public void insert(int val){
        if(end==data.length-1){
            System.out.println("Queue is full");
            return;
        }
        end++;
        data[end]=val;
    }
    public int remove() throws Exception{
        if(end==-1){
            throw new Exception("can't remove from empty queue!!");
        }
        int removed=data[0];
        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(end==-1){
            throw new Exception("can't remove from empty queue!!");
        }
        return data[0];
    }
    public void display(){
        for (int i = 0; i <=end ; i++) {
            System.out.print(data[i]+ " ");
        }
    }
}
