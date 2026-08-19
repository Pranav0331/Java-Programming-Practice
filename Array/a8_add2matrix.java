import java.util.*;
public class a8_add2matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Emter the Row and Cals: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println("Enter the Matrix-A Value: ");

        int a1[][]=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a1[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the Matrix-b Value: ");
        int a2[][]=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a2[i][j]=sc.nextInt();
            }
        }
        int a3[][]=new int[n][m];
        System.out.println("Sum of Martix: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                 a3[i][j]=a1[i][j]+a2[i][j];
                 System.out.print(a3[i][j]+ " ");
            }
            System.out.println();
        }



        
    }
}
