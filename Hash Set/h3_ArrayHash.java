import java.util.HashMap;
public class h3_ArrayHash {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

        HashMap<String,Integer>map = new HashMap<>();

        map.put("India",100);
        map.put("Us",90);
        map.put("China",120);
        map.put("Napal",100);

        for(HashMap.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        }

    }
    
}

