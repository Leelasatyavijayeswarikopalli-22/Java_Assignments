package Video_questions.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class File_writer {
    public static void main(String[] args) {
        try( FileWriter fw=new FileWriter("Myfile.txt",true)){
            fw.write("Hello vijju!.It is appended.");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
