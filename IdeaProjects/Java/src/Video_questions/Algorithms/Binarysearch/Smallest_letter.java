package Video_questions.Algorithms.Binarysearch;
//https://letcode.com/problems/find-smallest-letter-greater-than-target/
public class Smallest_letter {
    public static void main(String[] args) {
        char[] ch={'c','g','i','l','o','s','t','w'};
        char target='x';
        System.out.println(small(ch,target));
    }
    static char small(char[] ch,char target){
       int start=0;
       int end=ch.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<ch[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        //start=end+1    As loop breaks;

        return ch[start%ch.length];
    }
}
