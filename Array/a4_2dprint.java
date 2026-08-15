import java.util.*;
public class a4_2dprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row /n and col");
        int row=sc.nextInt();
        int cal=sc.nextInt();

        int num[][]=new int[row][cal];
        for(int i=0; i<row; i++){
            for(int j=0; j<cal; j++){
                num[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<cal; j++){
                 System.out.print(num[i][j]+" ");   
            }
            System.out.println();
        }
    }
    
}
