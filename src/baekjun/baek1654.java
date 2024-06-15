package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baek1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[] have = new int[k];
        long right = 0;
        long left = 1;
        for(int i = 0; i < k; i++) {
            have[i] = sc.nextInt();
            if(right < have[i]) {
                right = have[i];
            }
        }
        sc.close();

        while(left <= right) {
            long mid = (left + right) / 2;
            long count = 0;

            for(int num : have) {
                count += (num / mid);
            }
            if(count < n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(right);
    }
}
