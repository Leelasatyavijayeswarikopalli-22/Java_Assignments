package Video_questions.FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_reader {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("Myfile.txt")){
            int letters;
            while((letters=fr.read())!='!'){
                System.out.println((char)letters);
            }
            fr.close();
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
