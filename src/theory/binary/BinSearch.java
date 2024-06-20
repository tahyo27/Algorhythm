package theory.binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {

        int num = 100000000;
        int[] numbers = new int[num];

        for(int i = 0; i < num; i++) {
            numbers[i] = i + 1;
        }
        int key = 200000000;
        System.out.print("검색할 값: " + key);

        long startTime = System.currentTimeMillis();
        int idx = binSearch(numbers, num, key);
        long endTime = System.currentTimeMillis() - startTime;

        System.out.println("걸리는 시간 : " + endTime / 1000.0 + "sec");

        if(idx == -1) {
            System.out.println("값 없음");
        } else {
            System.out.println("값은 x[" + idx + "]에 있다");
        }
        System.out.println(Arrays.binarySearch(numbers, key));
    }


    static int binSearch(int [] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        do{
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if(a[pc] < key) {
                pl = pc + 1;
            } else if(a[pc] > key) {
                pr = pc - 1;
            }
        } while (pl <= pr);
        return -1;
    }
}
