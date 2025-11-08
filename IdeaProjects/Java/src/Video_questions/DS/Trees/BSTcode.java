package Video_questions.DS.Trees;

public class BSTcode {
    private class Node{
        int val;
        Node left;
        Node right;
        int height;
        public Node(int val){
            this.val=val;
        }
        public int getValue(){
            return val;
        }
    }
    private Node root=null;
    public int height(Node node){
        if(node==null){
            return -1;
        }
      return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(){
        display(root,"Root Node: ");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"Left child of "+node.val+"is ");
        display(node.right,"Right child of "+node.val+"is ");
    }
    public void insert(int value){
        root=insert(root,value);
    }
    private Node insert(Node node,int value){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.val){
            node.left=insert(node.left,value);
        }
        if(value>node.val){
            node.right=insert(node.right,value);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    //insert multiple items
    public void populate(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            insert(nums[i]);
        }
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left)&&balanced(node.right);
    }
    public void populatedSorted(int[] nums){
        populatedSorted(nums,0,nums.length);
    }
private void populatedSorted(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        this.insert(nums[mid]);
        populatedSorted(nums,start,mid);
        populatedSorted(nums,mid+1,end);
}
    public static void main(String[] args) {
        BSTcode bst=new BSTcode();
        int[] nums={5,2,7,1,4,10};
        bst.populate(nums);
        bst.display();
        bst=new BSTcode();
        nums=new int[]{1,2,3,4,5,6,7,8,9,10};
        bst.populatedSorted(nums);
        bst.display();
    }
}
