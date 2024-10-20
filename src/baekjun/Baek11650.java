package baekjun;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//
//        문제
//        2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
//
//        출력
//        첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
public class Baek11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] x = new int[N][2];
        for(int i = 0; i < N; i++) {
            x[i][0] = sc.nextInt();
            x[i][1] = sc.nextInt();
        }
        Arrays.sort(x, (a, b) -> {
            if(a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });


        for(int i = 0; i < N; i++) {
            System.out.print(x[i][0] + " " + x[i][1] + "\n");
        }

    }
}
