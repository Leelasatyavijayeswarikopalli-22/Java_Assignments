package Video_questions.Trees;

public class SegmentTrees {
    public static void main(String[] args) {
        int[] arr={3,8,6,7,-2,-8,4,9};
        SegmentTrees st=new SegmentTrees(arr);
        st.display();
    }
    private static class Node {
         int data;
         int start;
         int end;
        Node left;
        Node right;

        public Node(int start, int end){
            this.start=start;
            this.end=end;
        }
    }
    Node root;
    public SegmentTrees(int[] arr){
        this.root=constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int[] arr,int start,int end){
        if(start==end){
            Node leaf=new Node(start,end);
            leaf.data=arr[start];
            return leaf;
        }
        Node node=new Node(start,end);
        int mid=start+(end-start)/2;
        node.left=this.constructTree(arr,start,mid);
        node.right=this.constructTree(arr,mid+1,end);
        node.data=node.left.data+node.right.data;
        return node;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str="";
        if(node.left!=null){
            str=str+"Interval=["+node.left.start+"-"+node.left.end+"] and data: "+node.left.data+"+ ->";
        }else{
            str=str+"No left child";
        }
        if(node.right!=null){
            str=str+"Interval=["+node.right.start+"-"+node.right.end+"] and data: "+node.right.data+"+ ->";
        }else{
            str=str+"No right child";
        }
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }
    public int query(int qsi,int qei){
        return this.query(this.root,qsi,qei);
    }
    private int query(Node node,int qsi,int qei){
        if(node.start>=qsi&&node.end<=qei){
            return node.data;
        }
        if(node.start<qsi||node.end<qei){
            return 0;
        }else{
            return query(node.left,qsi,qei)+query(node.right,qsi,qei);
        }
    }
    public void update(int index,int val){
       this.root.data=update(root,index,val);
    }
    private int update(Node node,int index,int val){
        if((index>=node.start)&&(index<=node.end)){
            if(index==node.start&&index==node.end){
                node.data=val;
                return node.data;
            }else{
                int leftAns=update(node.left,index,val);
                int rightAns=update(node.right,index,val);
                node.data=leftAns+rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
