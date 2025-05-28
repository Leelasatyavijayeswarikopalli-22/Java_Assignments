package Video_questions.Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class max_between_indices {
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
            System.out.println(max(arr,n,m));
        }
        static int max(int[] arr,int n,int m){
            int max=0;
            //edge cases
            if(n>m){
                return -1;
            }
            for(int i=n;i<=m;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
    }

