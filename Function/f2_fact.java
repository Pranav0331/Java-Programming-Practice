import java.util.Scanner;
public class f2_fact {
    public static void fact(int n) {
         int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println(fact);
        return;

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number: ");

        int n=sc.nextInt();
        fact(n);

    }

}
