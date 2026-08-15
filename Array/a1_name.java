import java.util.Scanner;
public class a1_name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the sizze of array");
        int size=sc.nextInt();

        String name []=new String[size];
        
        for(int i=0; i<size; i++){
            name[i]=sc.next();
        }
        for(int i=0; i<name.length; i++) {
           System.out.println("name " + (i+1) +" is : " + name[i]);
       }
    }
}
