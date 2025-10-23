package Video_questions.Strings;
import java.util.*;
public class RandomString {
    public static void main(String[] args) {
       generate(12);
    }
    public static void generate(int size){
        StringBuffer sb=new StringBuffer();
        Random random=new Random();
        for (int i = 0; i <size ; i++) {
            int r=(int)(26*(random.nextFloat()));
            sb.append((char)('a'+r));
        }
        System.out.println(sb);
    }
}
