public class permutationarray {
    public static void printarry(int[] a) {
        System.out.println("\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void permute(int[] a, int cid) {
        if (cid == a.length - 1) {
            printarry(a);
            return;
        } else {
            for (int i = cid; i < a.length; i++) {
                swap(a, i, cid);
                permute(a, cid + 1);
                swap(a, i, cid);

            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        permute(a, 0);

    }

}
