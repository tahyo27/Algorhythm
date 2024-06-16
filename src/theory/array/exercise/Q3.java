package theory.array.exercise;

public class Q3 {
    public static void main(String[] args) {
        //배열의 모든 요소 합하는 메서드
        int[] ary = {2, 5, 1, 3, 6, 7};
        System.out.println(sumOf(ary));
    }
    public static int sumOf(int[] a) {
        int sum = 0;
        for(int num : a) {
            sum += num;
        }
        return sum;
    }
}
