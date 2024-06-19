package theory.linear;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 100000000;
        int[] numbers = new int[num];

        for(int i = 0; i < num; i++) {
            numbers[i] = i + 1;
        }

        System.out.print("검색할 값: ");
        int key = sc.nextInt();
        sc.close();

        long startTime = System.currentTimeMillis();
        int idx = seqSearch(numbers, num, key);
        long endTime = System.currentTimeMillis() - startTime;

        System.out.println("걸리는 시간 : " + endTime / 1000.0 + "sec");

        if(idx == -1) {
            System.out.println("값 없음");
        } else {
            System.out.println("값은 x[" + idx + "]에 있다");
        }
    }

    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while(true) {
            if(i == n) {
                return -1;
            }
            if(a[i] == key) {
                return i;
            }
            i++;
        }
    } //seqSearch

}//class
