
import java.util.*;

public class P1_Swapkblock {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n=sc.nextInt();
        System.out.println("Enetr the k: ");
        int k=sc.nextInt();
        System.out.println("Entr the array ele : ");
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();

        }
         for (int i = 0; i < n-k; i++) {
            int temp = a[i];
            a[i] = a[i + k];
            a[i + k] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
