package baekjun;

import java.util.Scanner;

public class Baek2343 {
    public static void main(String[] args) {
        //i와 j사이의 모든 강의도 같은 블루 레이에 녹화
        //m개의 블루레이에 모든 기타 강의 동영상 녹화
        // 블루레이 크기 최소 m개의 블루레이는 모두 같은 크기
        //n강의수 m블루레이 숫자
        //right는 다 더한 max 최소는 가장 큰값

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bluray = new int[n];
        int left = -1;
        int right = 0;
        for(int i = 0; i < n; i++) {
            bluray[i] = sc.nextInt();
            left = Math.max(left, bluray[i]);
            right += bluray[i];
        }
        sc.close();

        searchSize(bluray, left, right, m);

    }

    public static int getCount(int[] bluray, int mid) {
        int count = 1;
        int sum = 0;
        for (int i : bluray) {
            sum += i;
            if (sum > mid) {
                sum = i;
                count++;
            }
        }
        return count;
    }

    public static void searchSize(int[] bluray, int left, int right, int m) {

        while(left <= right) {
            int mid = (left + right) / 2;
            int count = getCount(bluray, mid);
            if(count > m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left);
    }


}
