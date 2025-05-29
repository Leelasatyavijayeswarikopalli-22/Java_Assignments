package Video_questions.Algorithms.Linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class Search_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter 9 integers for the 3x3 array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println(Arrays.toString(search(arr)));    //Because through search function I am returning another array
    }

    static int[] search(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 10) {
                    System.out.println("The indexes are ");
                    return new int[]{i, j};                                //It is not declared anywhere that
                                                                            // we can use i and j as an array
                                                                            // [but in int[][] arr={1,23,3} we don't need "new"
                                                                             // keyword as it is already declared as an array]
                                                                            //So we have to create a new object in this way in a form of array
                                                                           //  to return more than one value
                }
            }
        }
        System.out.println("The indexes are ");
        return new int[]{-1, -1};
    }
}