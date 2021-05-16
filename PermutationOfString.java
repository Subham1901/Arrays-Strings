import java.util.Scanner;

public class PermutationOfString {
    public static String swap(String s, int i, int j) {
        char[] b = s.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        result(s, 0, len);
    }

    public static void result(String s, int start, int end) {
        if (start == end - 1) {
            System.out.println(s);
        } else {
            for (int i = start; i < end; i++) {
                s = swap(s, start, i);
                // Recursively calling function generatePermutation() for rest of the characters
                result(s, start + 1, end);
                // Backtracking and swapping the characters again.
                s = swap(s, start, i);
            }
        }

    }
}
