package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class Baek1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxScore = 0;
        sc.nextLine();
        int[] scores = new int[n];

        for(int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        sc.close();

        maxScore = Arrays.stream(scores).max().orElse(1);

        double[] doubleScores = new double[n];
        for(int i = 0; i < n; i++) {
            doubleScores[i] = (double) scores[i] / maxScore * 100;
        }

        double avg = Arrays.stream(doubleScores).average().orElse(0.0);

        System.out.println(avg);

    }
}
