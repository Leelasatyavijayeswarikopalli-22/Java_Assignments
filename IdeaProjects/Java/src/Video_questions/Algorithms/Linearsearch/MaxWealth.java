package Video_questions.Algorithms.Linearsearch;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts={
                {1,2,3},{4,1,2},{6,1,2}
        };
        System.out.println(max(accounts));
    }
    static int max(int[][] accounts) {
       int answer=Integer.MIN_VALUE;
       for(int[] i:accounts) {
           int sum = 0;
           for (int j :i) {
               sum += j;
           }
           if (sum > answer) {
               answer = sum;
           }
       }

       return answer;
    }

}
