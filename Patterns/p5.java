import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=i; j<=n-1; j++)
                {
                     System.out.print("-");
                }
                for(int j=1;j<=i;j++){
                     System.out.print("*");
                }
                System.out.println(" ");
        }
    }
    
}