package programmers.one;

import java.util.Scanner;

//문제 설명
//        정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
//
//        제한 조건
//        num은 int 범위의 정수입니다.
//        0은 짝수입니다.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(answer(num));

    }
    public static String answer(int num) {
        if(num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
