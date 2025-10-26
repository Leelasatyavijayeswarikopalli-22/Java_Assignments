package Video_questions.Hashmaps;

public class Code {
    public static void main(String[] args) {
        Code w=new Code();
        String n="bro";
        String l="bro";
        String m=new String("bro");
        Long q=12334545898L;
        int code=n.hashCode();
        int code2=l.hashCode();
        int code3=m.hashCode();
        System.out.println(code);
        System.out.println(code2);
        System.out.println(code3);
        System.out.println(q.hashCode());
        System.out.println(w.hashCode());
    }
}
