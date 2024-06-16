package theory.array.exercise;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] ary = {2, 5, 1, 3, 6, 7};
        int[] ary2 = new int[ary.length];
        System.out.println("Array1 : " + Arrays.toString(ary));
        System.out.println("Array2 : " + Arrays.toString(ary2));
        reverseAryCopy(ary, ary2);
        System.out.println("Array1 : " + Arrays.toString(ary));
        System.out.println("Array2 : " + Arrays.toString(ary2));
    }

    public static void reverseAryCopy(int[] a, int[] b) {
        for(int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
    }
}
