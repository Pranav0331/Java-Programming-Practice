import java.util.Scanner;
public class l6_posneg {
    public static void main(String[] args) {

        int n,pos=0,neg=0,ch=1,zero=0;
        while(ch==1){
        System.out.print("Enter the Number: ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        if(n==0)
            zero++;
         else if(n<0)
            neg++;
        else if (n>0)
            pos++;

            System.out.print("Enter your choice for continue or exit : ");
            ch=sc.nextInt();

        }
        System.out.println(zero);
        System.out.println(neg);
        System.out.println(pos);
    }
    
}
