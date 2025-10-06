package Video_questions.DS.stacks;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE=5;
    public Stack(){
        this(DEFAULT_SIZE);
    }
    public Stack(int size){
        this.data=new int[size];
    }
    int top=-1;
    public void push(int val){
        if(top==data.length-1){
            System.out.println("stack full");
            return;
        }
        top++;
        data[top]=val;
    }
    public int pop() throws Exception{
        if(top==-1){
            throw new Exception("Can't pop when stack is empty");
        }
        int removed=data[top];
        top--;
        return removed;
    }
    public int peek() throws Exception{
        if(top==-1) {
            throw new Exception("Can't peek when stack is empty");
        }
        return data[top];
    }
}
