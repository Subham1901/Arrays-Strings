import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    static List<String> al = new ArrayList<>();

    public static void main(String[] args) {

        String s = "abc";
        result(s, "");
        for (String e : al) {
            System.out.println(e);
        }
    }

    public static void result(String s, String ans) {
        if (s.length() == 0) {
            al.add(ans);
            return;

        }
        result(s.substring(1), ans + s.charAt(0)); // We add adding 1st character in string
        result(s.substring(1), ans);// Not adding first character of the string
    }

}
