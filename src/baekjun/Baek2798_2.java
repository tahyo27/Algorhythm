package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2798_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        int result = 0;
        for (int i = 0; i < N - 2; i++) {
            int left = i + 1;
            int right = N - 1;

            while (left < right) {
                int sum = array[i] + array[left] + array[right];

                if (sum == M) {
                    result = sum;
                    break;
                }

                if (sum < M) {

                    result = Math.max(result, sum);
                    left++;
                } else {

                    right--;
                }
            }
        }
        System.out.println(result);

    }
}
