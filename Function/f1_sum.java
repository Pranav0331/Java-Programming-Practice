import java.util.Scanner;
public class f1_sum {
    public static int calSum(int a,int b) {
        int sum=a+b;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum =calSum(a,b);
        System.out.println("Sum of two Number is: "+ sum);

    }
    
}
