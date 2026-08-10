import java.util.Scanner;

public class l2_prime {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ennter");
        int n = sc.nextInt();
        int count =0;
        if(n==0||n==1){
            count =1;

        }
        for(int i=2; i<n/2;i++){
            if(n%i==0){
                count =1;
                break;

            }

        }
        if(count==0){
            System.out.print(n+ " Is a prime");
        }
        else 
            System.out.print(n + " Not prime");


     }
    
}
