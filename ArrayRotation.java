public class ArrayRotation {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int rotation = 3;
        int rotpoint = rotation;
        int op[] = new int[a.length];

        int i = 0;
        while (rotpoint < a.length) {
            op[i] = a[rotpoint];// print 4 and 5 to index 0 and 1
            i++;
            rotpoint++;

        }
        rotpoint = 0;
        while (rotpoint < rotation) {// print all the rest of element 2 3 and 4th index;
            op[i] = a[rotpoint];
            i++;
            rotpoint++;
        }
        for (int ArrayRot : op) {
            System.out.print(ArrayRot);
        }

    }

}
