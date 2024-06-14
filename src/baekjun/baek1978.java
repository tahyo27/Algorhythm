package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baek1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        long count =  Arrays.stream(numbers).filter(baek1978::isPrime).count();

        System.out.println(count);
    }

    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
