import java.util.Scanner;
public class l5_perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1 ; i<=n/2 ; i++)
    {
        if(n%i==0)
        {
        
             sum=sum+i;
        }
    }
        if(sum==n&&n>0)
            System.out.print(n + " is the perfact");
        else
            System.out.print(n + " is not perfact");   
}

        
    }
    

