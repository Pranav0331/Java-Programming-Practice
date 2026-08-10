import java.util.Scanner;
public class l4_fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value:");
        int n=sc.nextInt();
        System.out.print("Enter the first two Number:");
        int a=sc.nextInt(),b=sc.nextInt();
        int c;
        System.out.print(a + " " + b + " ");
        for(int i=3; i<=n; i++){
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        
        }
    }
    
}
