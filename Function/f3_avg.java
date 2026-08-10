import java.util.Scanner;
public class f3_avg {
    public static void avg(int a, int b, int c) {
            int avg;
            avg=(a+b+c)/3;
            System.out.println(avg);
            return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("ENter the Number :  ");

    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    avg(a,b,c);
    }

}
