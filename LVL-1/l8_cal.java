import java.util.Scanner;

public class l8_cal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter operator (+, -, *, /): ");
        char ch = sc.next().charAt(0);

        int a, b;
        int ans;

        switch(ch) {

            case '+':
                System.out.print("Enter two numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();

                ans = a + b;
                System.out.println(ans);
                break;

            case '-':
                System.out.print("Enter two numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();

                ans = a - b;
                System.out.println(ans);
                break;

            case '*':
                System.out.print("Enter two numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();

                ans = a * b;
                System.out.println(ans);
                break;

            case '/':
                System.out.print("Enter two numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();

                ans = a / b;
                System.out.println(ans);
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}