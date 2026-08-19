import java.util.*;
public class s2_equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1st string: ");
        String s1=sc.next();

        System.out.println("2nd String");
        String s2=sc.next();

        if(s1.equals(s2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}
