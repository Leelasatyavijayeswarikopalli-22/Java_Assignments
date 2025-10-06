package Video_questions.DS.Queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=5;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }
    int end=-1;
    int front=-1;
    int size=0;
    public void insert(int val){
        if(size==data.length){
            System.out.println("Overflow");
            return;
        }
        if(front==-1){
            front=0;
        }
        end=(end+1)%data.length;
        data[end]=val;
        size++;
    }
    public int remove(){
        if(size==0){
            System.out.println("Empty");
        }
        int removed=data[front];
        size--;
        front=(front+1)%data.length;
        return removed;
    }
    public int front() throws Exception{
        if(end==-1){
            throw new Exception("can't remove from empty queue!!");
        }
        return data[front];
    }
    public void display(){
        for (int i =0; i <data.length ; i++) {
            System.out.print(data[(front+i)%data.length]+ " ");
        }
    }
}
