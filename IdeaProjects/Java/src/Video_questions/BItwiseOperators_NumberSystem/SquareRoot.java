package Video_questions.BItwiseOperators_NumberSystem;

public class SquareRoot {
    public static void main(String[] args) {
        int n=36;
        int p=3;
        System.out.printf("%.3f",search(n,p));
    }
    static double search(int n,int p){
       double root=0.0;
        double increment=0.1;
        for (int i = 0; i <p ; i++) {
            while(root*root<=n){
                root+=increment;
            }
            root-=increment;
            increment/=10;
        }
        return root;
        }
}
//int start=0;
//int end=n;
//double root=0.0;
//        while(start<=end){
//int mid=start+(end-start)/2;                              //mid=(start+end)/2  =>if (start+end)>int range we can't search
//            if(mid*mid>n){                                  //so we use this formula in order to overcome that problem
//end=mid-1;
//        }else if(mid*mid<n){
//start=mid+1;
//        }else{
//        return mid;
//            }
//                    }
