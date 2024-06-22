package baekjun;

import java.util.Scanner;

public class Baek2512 {
    public static void main(String[] args) {
        //모든 요청 가능한 경우 요청금액 배정
        //모든 요청 없으면 상한액설정
        //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] province = new int[n];
        int max = -1;
        for(int i = 0; i < n; i++) {
            province[i] = sc.nextInt();
            max = Math.max(max, province[i]);
        }
        int m = sc.nextInt();
        sc.close();
        maxBudget(province, max, m);

        }

        public static int sumBudget(int[] array, int mid) {
            int result = 0;
            for (int j : array) {
                result += Math.min(j, mid);
            }
            return result;
        }

        public static void maxBudget(int[] array, int max, int m) {
            int pl = 0;
            int pr = max;

            while(pl <= pr) {
                int mid = (pl + pr) / 2;
                int budget = sumBudget(array, mid);

                if(budget <= m) {
                    pl = mid + 1;
                } else {
                    pr = mid - 1;
                }
            }
            System.out.println(pr);
        }
}
