package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bw.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] nums = new long[n + 1];
        st = new StringTokenizer(bw.readLine(), " ");
        for(int i = 1; i <= n; i++) {
           nums[i] = nums[i - 1] + Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(bw.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            System.out.println(nums[y] - nums[x - 1]);
        }

    }
}
