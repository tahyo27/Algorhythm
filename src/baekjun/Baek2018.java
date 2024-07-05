package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int startIdx = 1;
        int endIdx = 1;
        int count = 1;
        int sum = 1;
        while(endIdx != N) {
            if(sum == N) {
                count++;
                endIdx++;
                sum += endIdx;
            } else if(sum < N) {
                endIdx++;
                sum += endIdx;
            } else if(sum > N) {
                sum -= startIdx;
                startIdx++;
            }
        }
        System.out.println(count);

    }
}
