package baekjun;

import java.util.Scanner;

public class Baek2231 {
    public static void main(String[] args) {
        //N의 분해합 N과 N을 이루는 각자리수의 합
        //M의 분해합이 N인경우 M을 N의 생성자
        // N이 주어졌을때 가장 작은 생성자
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //분해합이 주어졌을때 가장 작은 생성자 찾기
        //가장 작은게 앞으로 나오기
        sc.close();
        int result = 0;
        for(int i = 0; i < n; i++) {
            if(n == ctor(i)) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    public static int ctor(int n) {
        int result = n;
        while(n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
}
