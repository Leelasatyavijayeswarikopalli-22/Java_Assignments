package Video_questions.FileHandling;
import java.io.*;
public class Inputstream {
    public static void main(String[] args) {
        try(InputStreamReader isr=new InputStreamReader(System.in)){
            System.out.println("Enter some letters");
            int letters;
            while((letters=isr.read())!='!'){
                System.out.println((char)letters);
            }
            isr.close();
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
