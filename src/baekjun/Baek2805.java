package baekjun;

import java.util.Scanner;

public class Baek2805 {
    public static void main(String[] args) {
        //나무 M미터 필요
        //높이 H 지정
        //적어도 M미터의 나무를 집에 가져가기 위해 절단기 설정 높이 최대값
        //나무의 수 N 집으로 가져가려고 하는 나무의 길이 M
        //M미터의 나무를 집에 가져가기 위해 절단기에 설정할 수 있는 높이의 최대값
        //커팅 출력하는 값 만들기 max 값 토대로 이진
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int left = 0;
        int right = -1;
        int[] trees = new int[n];
        for(int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();
            right = Math.max(right, trees[i]);
        }
        sc.close();
        treeLoop(trees, left, right, m);

    }

    public static long treeCutting(int[] trees, int height) {
        long result = 0;
        for(int i = 0; i < trees.length; i++) {
            if(trees[i] > height) {
                result += trees[i] - height;
            }
        }
        return result;
    }

    public static void treeLoop(int[] trees, int left, int right, int m) {

        while(left <= right) {
           int mid = (left + right) / 2;
           long cuttingSum = treeCutting(trees, mid);

           if(cuttingSum >= m) {
               left = mid + 1;
           } else { // tree < m;
               right = mid - 1;
           }
        }
        System.out.println(right);
    }

}
