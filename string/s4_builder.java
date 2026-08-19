import java.util.*;
public class s4_builder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        
        sb.append("Hello");
        sb.append(" ");
        sb.append("Pranav");
        System.out.println(sb);

        String s = "hello";
        StringBuilder sb1 = new StringBuilder(s);
        sb1.reverse();
        System.out.println(sb1);

        String s2 = "hello";
        StringBuilder sb2 = new StringBuilder(s);
        sb2.reverse();
        String ans = sb2.toString();
        System.out.println(ans);


        String s3 = "banana";
        int count = 0;
        for(int i = 0; i < s3.length(); i++) {
            if(s3.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);


        String s4 = "banana";
        int[] freq = new int[26];
        for(int i = 0; i < s4.length(); i++) {
            freq[s4.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
            System.out.println((char)('a' + i) + " : " + freq[i]);
            }
        }


        String s5 = "I love programming";
        String[] words = s5.split(" ");
        String longest = "";
        for(int i = 0; i < words.length; i++) {
             if(words[i].length() > longest.length()) {
                 longest = words[i];
            }
        }
        System.out.println(longest);

    }
}
