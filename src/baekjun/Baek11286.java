package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baek11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> que = new PriorityQueue<>((o1,o2) -> {
           int first = Math.abs(o1);
           int second = Math.abs(o2);
           if(first > second) {
               return first - second;
           } else if(first == second) {
               return o1 - o2;
           } else {
               return -1;
           }
        });
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if(request == 0) {
                if(que.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(que.poll()).append("\n");
                }
            } else {
                que.add(request);
            }
        }
        System.out.println(sb);
    }
}
