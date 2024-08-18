package baekjun;

import java.util.Scanner;

public class Baek1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] A = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }
        for(int i = 0; i < str.length(); i++) {
            int max = i;
            for(int j = i + 1; j < str.length(); j++) {
                if(A[j] > A[max]) {
                    max = j;
                }

            }
            if(A[i] < A[max]) {
                int tmp = A[i];
                A[i] = A[max];
                A[max] = tmp;
            }
        }
        for(int i = 0; i < str.length(); i++) {
            System.out.print(A[i]);
        }
    }
}
