package Video_questions.DS.Queues;

public class DynamicQ extends CircularQueue{
    public DynamicQ(){
        super();
    }
    public DynamicQ(int size){
        super(size);
    }
    @Override
    public void insert(int val) {
        if(size==data.length){
            int[] temp=new int[data.length*2];
            //copy all elements into this array temp
            for (int i = 0; i <data.length ; i++) {
                temp[i]=data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data=temp;
            super.insert(val);
        }
    }
}
