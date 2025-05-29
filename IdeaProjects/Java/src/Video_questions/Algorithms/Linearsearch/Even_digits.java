package Video_questions.Algorithms.Linearsearch;

public class Even_digits {
    public static void main(String[] args) {
        int[] arr={12,-4568,5,112,4444,0,7,1000};
        int answer=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            if(arr[i]<0){
             arr[i]=arr[i]*(-1);
            }
            if(arr[i]==0){
                count=1;
            }
            while(arr[i]>0) {
             arr[i]=arr[i]/10;
               count++;
            }
            if(count%2==0) {
                answer++;
            }
        }
            System.out.println(answer);
    }
}
