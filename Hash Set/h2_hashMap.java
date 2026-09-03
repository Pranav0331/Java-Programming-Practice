import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class h2_hashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String,Integer>map = new HashMap<>();

        map.put("India",100);
        map.put("Us",90);
        map.put("China",120);
        map.put("Napal",100);

        System.out.println(map);

    }
    
}

