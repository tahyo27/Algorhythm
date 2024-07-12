package baekjun;

import java.io.*;
import java.util.*;

public class Baek12891 {
    static int checkNum = 0;
    static int[] tempAry;
    static int[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bw.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] dnaAry = bw.readLine().toCharArray();
        st = new StringTokenizer(bw.readLine());
        tempAry = new int[4];
        check = new int[4];
        int result = 0;
        for(int i = 0; i < 4; i++) {
            check[i] = Integer.parseInt(st.nextToken());
            if (check[i] == 0) { //0이면 없어도 되니까 이미 만족
                checkNum++;
            }
        }
        for(int i = 0; i < P; i++) {
           addWindow(dnaAry[i]);
        }

        if(checkNum == 4) result++;

        for(int i = P; i < S; i++) {
            int j = i - P;
            addWindow(dnaAry[i]);
            removeWindow(dnaAry[j]);
            if(checkNum == 4) result++;
        }
        System.out.println(result);

    }

    private static void removeWindow(char c) {
        switch (c) {
            case 'A':
                if(tempAry[0] == check[0]) checkNum--;
                tempAry[0]--;
                break;
            case 'C':
                if(tempAry[1] == check[1]) checkNum--;
                tempAry[1]--;
                break;
            case 'G':
                if(tempAry[2] == check[2]) checkNum--;
                tempAry[2]--;
                break;
            case 'T':
                if(tempAry[3] == check[3]) checkNum--;
                tempAry[3]--;
                break;
        }
    }

    private static void addWindow(char c) {
        switch (c) {
            case 'A':
                tempAry[0]++;
                if(tempAry[0] == check[0]) checkNum++;
                break;
            case 'C':
                tempAry[1]++;
                if(tempAry[1] == check[1]) checkNum++;
                break;
            case 'G':
                tempAry[2]++;
                if(tempAry[2] == check[2]) checkNum++;
                break;
            case 'T':
                tempAry[3]++;
                if(tempAry[3] == check[3]) checkNum++;
                break;
        }
    }
}
