import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(int i=n; i>0;i--){
            for(int j=i; j>0; j--)
                {
                     System.out.print("*");
                }
                System.out.println();
        }
    }
    
}