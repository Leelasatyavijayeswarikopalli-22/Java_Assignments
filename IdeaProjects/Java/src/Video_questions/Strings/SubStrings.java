package Video_questions.Strings;

public class SubStrings {
    public static void main(String[] args) {
        String name="vijju";
        for (int i = 0; i <name.length() ; i++) {
            for (int j = i + 1; j < name.length(); j++) {
                System.out.println(name.substring(i, j));
            }
        }
    }
}