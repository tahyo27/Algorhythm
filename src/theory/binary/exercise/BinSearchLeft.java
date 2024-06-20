package theory.binary.exercise;

public class BinSearchLeft {
    public static int binSearchLeft(int[] a, int key) {
        int pl = 0;
        int pr = a.length - 1;
        int result = -1;
        while (pl <= pr) {
            int mid = (pl + pr) / 2;
            System.out.println("pl: " + pl + " pr: " + pr + " mid: " + mid);
            System.out.println("a[pl]: " + a[pl] + " a[pr]: " + a[pr] + " a[mid]: " + a[mid]);

            if (a[mid] == key) {
                result = mid; // 키를 찾으면 결과를 업데이트
                pr = mid - 1; // 오른쪽 부분 배열을 계속 탐색
            } else if (a[mid] < key) {
                pl = mid + 1; // 키가 중간값보다 크면 오른쪽 부분 탐색
            } else {
                pr = mid - 1; // 키가 중간값보다 작으면 왼쪽 부분 탐색
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,7,7,7,7,8,8,9,9};
        int[] array2 = {6,7,8,9,5,4,4,3,2};
        int key = 7;
        System.out.println(binSearchLeft(array, key));

    }
}
