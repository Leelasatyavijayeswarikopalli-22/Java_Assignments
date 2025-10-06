package Video_questions.DS.stacks;

public class DynamicStack extends Stack{
    public static void main(String[] args) {
        DynamicStack stack=new DynamicStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
    }
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public void push(int val) {
       if(top==data.length-1){
           int[] temp=new int[data.length*2];
           //copy all elements into this array temp
           for (int i = 0; i <data.length ; i++) {
               temp[i]=data[i];
           }
           data=temp;
           super.push(val);
       }
    }
}

