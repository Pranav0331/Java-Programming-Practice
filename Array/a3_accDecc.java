import java.util.*;

public class a3_accDecc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int n = sc.nextInt();

        int numbers[] = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }

            if (numbers[i] < numbers[i + 1]) {
                isDescending = false;
            }
        }
        if (isAscending) {
            System.out.println("Array is in Ascending order");
        } 
        else if (isDescending) {
            System.out.println("Array is in Descending order");
        } 
        else {
            System.out.println("Array is not sorted");
        }
    }
}
