package Video_questions.Algorithms.Linearsearch;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value to be checked:");
        int n=input.nextInt();
        int[] arr={2,23,45,67,12,12,86,21,98,44,56,78,33,55};
        System.out.println(ls(arr,n));
    }
    static int ls(int[] arr,int n){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
              return i;
            }
        }
        return -1;
    }
}
