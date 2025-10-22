package Video_questions.Trees;

import java.util.Scanner;

public class BTcode {
    class Node {
        int val;
        Node left;
        Node right;

        public Node(int value) {
            this.val = value;
        }
    }

    private Node root = null;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node) {
        System.out.println("DO you want to enter the left of the node " + node.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }
        System.out.println("DO you want to enter the right of the node" + node.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }
    public void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.val);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    public void prettyDisplay(Node node,int level){
       if(node==null){
           return;
       }
       prettyDisplay(node.left,level+1);
       if(level!=0){
           for (int i = 0; i <level-1; i++) {
               System.out.print("|\t\t");
           }
           System.out.println("|------->"+node.val);
       }else{
           System.out.println(node.val);
       }
       prettyDisplay(node.right,level+1);
    }
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.val+"  ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+"  ");
    }
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+"  ");
        inOrder(node.right);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BTcode bt=new BTcode();
        bt.populate(scanner);
        bt.prettyDisplay();
        bt.preOrder(bt.root);
        bt.inOrder(bt.root);
        bt.postOrder(bt.root);
    }
}
