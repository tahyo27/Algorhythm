package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1940 {
    //자료의 개수 N 두번째줄 M 그리고 고유한 번호들이 공백 두고
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bw.readLine());
        int M = Integer.parseInt(bw.readLine());
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(bw.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        int start = 0;
        int end = N - 1;
        int count = 0;
        while(start < end) {
            int sum = nums[start] + nums[end];
            if(sum > M) {
                end--;
            } else if(sum < M) {
                start++;
            } else {
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);

    }
}
