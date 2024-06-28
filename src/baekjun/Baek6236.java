package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class Baek6236 {
    public static void main(String[] args) {
        //N일동안 사용 금액 계산 M번만 빼기
        // K원 인출 해서 하루 면 그대로 사용 모자라면 집어넣고 K원 인출
        // M 번을 맞추기위해 남은 금액이 많더라고 남은 금액은 통장에 집어넣고 다시 K원 인출
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ary = new int[n];
        int maxAmount = 0;
        int totalAmount = 0;

        for(int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
            maxAmount = Math.max(maxAmount, ary[i]);
            totalAmount += ary[i];
        }
        sc.close();

        binarySearch(ary, maxAmount, totalAmount, m);
    }

    public static int countCheck(int[] ary, int mid) {
        int currentMoney = mid;
        int count = 1;

        for(int i : ary) {
            if (currentMoney < i) {
                count++;
                currentMoney = mid;
            }
            currentMoney -= i;
        }

        return count;
    }

    public static void binarySearch(int[] ary, int pl, int pr, int m) {
        int left = pl;
        int right = pr;
        int result = right;

        while(left <= right) {
            int mid = (left + right) / 2;
            int count = countCheck(ary, mid);
            if (count <= m) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(result);
    }
}
