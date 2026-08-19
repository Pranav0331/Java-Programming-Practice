import java.util.*;
public class s3_method {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String s2 = "hello world";
        System.out.println(s2.contains("world"));

        String s3 = "hello";
        System.out.println(s3.indexOf('l'));

        String s4 = "HelloWorld";
        System.out.println(s4.substring(5));

        String s5 = "HelloWorld";
        System.out.println(s5.substring(0, 5));

        String s6 = "hello";
        String result = s6.replace('l', 'x');
        System.out.println(result);

        String s7 = "hello";
        for(int i = s7.length() - 1; i >= 0; i--) {
        System.out.print(s7.charAt(i));
        }

        StringBuilder sb = new StringBuilder("hello");
        sb.reverse();
        System.out.println(sb);
    }
}
