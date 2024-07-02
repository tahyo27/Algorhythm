package baekjun;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];
        String input1 = br.readLine();

        StringTokenizer st1 = new StringTokenizer(input1, " ");
        for(int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(ary);

        int m = Integer.parseInt(br.readLine());

        String input2 = br.readLine();

        StringTokenizer st2 = new StringTokenizer(input2, " ");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for(int i = 0; i < m; i++) {

            if(binary(ary, Integer.parseInt(st2.nextToken())) >= 0) {
                bw.write(String.valueOf(1));
                bw.newLine();
            } else {
                bw.write(String.valueOf(0));
                bw.newLine();
            }
        }
        bw.flush();


    }

    public static int binary(int[] ary, int key) {
        int pl = 0;
        int pr = ary.length - 1;

        while(pl <= pr) {
            int mid = (pl + pr) / 2;

            if(key == ary[mid]) return mid;

            if(key < ary[mid]) {
                pr = mid - 1;
            } else {
                pl = mid + 1;
            }
        }

        return -1;

    }
}
