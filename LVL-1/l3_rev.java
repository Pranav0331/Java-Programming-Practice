import java.util.Scanner;
public class l3_rev 
{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int n=sc.nextInt();
     int d=0,rev=0;
     for(int i=n; i>0;i=i/10){
        d=i%10;
        rev=rev*10+d;
        
     }
     System.out.println(rev);

}
}
