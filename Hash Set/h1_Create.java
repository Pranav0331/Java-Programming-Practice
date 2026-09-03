import java.util.HashSet;
import java.util.Scanner;

public class h1_Create {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        set.remove(1);
        System.out.println(set);

        System.out.println(set.size());



    }
    
}
