public class ZeroSumSubarray {
    public static void main(String[] args) {
        int[] a = { 1, 1, -3, 0 };
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                if (sum == 0) {
                    found = true;
                    break;
                } else
                    continue;

            }

        }
        System.out.println(found);
    }

}
