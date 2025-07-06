package Video_questions.Patterns;
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
public class Q4 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 1; j <=i+1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
