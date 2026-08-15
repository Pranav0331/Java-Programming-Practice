import java.util.*;
public class a5_findelement {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

           System.out.print("Enter the total number of row and col:");
            int row=sc.nextInt();
            int cals=sc.nextInt();

            System.out.println("Enter the row /n and col:");
            int a[][]=new int[row][cals];

            for(int i=0; i<row; i++){
                for(int j=0; j<cals; j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.print("Enter the element to find: ");
            int num=sc.nextInt();

             for(int i=0; i<row; i++){
                for(int j=0; j<cals; j++){
                   if(num==a[i][j]){
                    System.out.println("element Found at (" + i +","+j+")");
                   }
                }
            }
        }
    
}
