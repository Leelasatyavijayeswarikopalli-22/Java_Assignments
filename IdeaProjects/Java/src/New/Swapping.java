package New;
//Swapping without using third variable
public class Swapping {
    public static void main(String[] args) {

        int m=7;
        int n=5;
        m=m^n;
        n=m^n;
        m=m^n;
        System.out.println(m+","+n);}
}
