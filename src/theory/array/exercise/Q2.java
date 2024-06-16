package theory.array.exercise;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        //배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성
        int[] ary = {2, 5, 1, 3, 6, 7};
        System.out.println(Arrays.toString(ary));
        for(int i = 0; i < ary.length / 2; i++) {
            swap(ary, i, ary.length - 1 - i);
        }
        System.out.println("역순 정렬을 마쳤습니다.");
        System.out.println(Arrays.toString(ary));

    }

    public static void swap(int[] ary, int idx1, int idx2) {
        int tmp = ary[idx1];
        ary[idx1] = ary[idx2];
        ary[idx2] = tmp;
        System.out.println("a[" + idx1 + "]과" + "a[" + idx2 + "]를 교환합니다.");
    }
}
