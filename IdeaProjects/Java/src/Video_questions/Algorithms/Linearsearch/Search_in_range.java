package Video_questions.Algorithms.Linearsearch;

import java.util.Scanner;

public class Search_in_range {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr =new int[6];
        System.out.println("Enter the starting index:");
        int n=input.nextInt();
        System.out.println("Enter the ending index:");
        int m=input.nextInt();
        System.out.println("Enter the array elements(length:6):");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the element to be checked:");
        int s=input.nextInt();
        System.out.println(search(arr,n,m,s));
    }
    static int search(int[] arr,int n,int m,int s){
        if(n>m){
            return -1;
        }
        for(int i=n;i<=m;i++){
            if(arr[i]==s){
                System.out.println("The index is ");
                return i;
            }
        }
        System.out.println("The index is ");
        return -1;
    }
}
