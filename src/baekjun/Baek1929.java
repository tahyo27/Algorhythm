package baekjun;

import java.util.Scanner;

public class Baek1929 {
    public static boolean[] ary;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        ary = new boolean[N + 1];
        prime();
        for(int i = M; i <= N; i++) {
            if(!ary[i]) {
                System.out.println(i);
            }
        }

    }

    public static void prime() {
        ary[0] = ary[1] = true;

        for(int i = 2; i <= Math.sqrt(ary.length); i++) {
            if(ary[i]) continue;
            for(int j = i * i; j < ary.length; j += i) {
                ary[j] = true;
            }
        }
    }
}
