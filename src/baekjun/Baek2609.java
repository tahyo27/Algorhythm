package baekjun;

import java.io.*;
import java.util.StringTokenizer;

public class Baek2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");
        int[] nums = new int[2];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int numsGcb = gcb(nums[0], nums[1]);
        int numsLcm = (nums[0] * nums[1]) / numsGcb;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(numsGcb));
        bw.newLine();
        bw.write(String.valueOf(numsLcm));
        bw.flush();

    }
    public static int gcb(int a, int b) {
        if(b == 0) return a;
        return gcb(b, a % b);
    }
}
