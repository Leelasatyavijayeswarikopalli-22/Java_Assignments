package Video_questions;

import java.math.BigInteger;

public class BigIntFactorial {
    public static void main(String[] args) {
       BigInteger ans=new BigInteger("1");
       int c=222222;
       for(int i=2;i<=c;i++){
           ans=ans.multiply(BigInteger.valueOf(i));
       }
        System.out.println(ans);
    }
}
