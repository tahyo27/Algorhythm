package baekjun;

import java.io.*;
import java.util.Arrays;

//        입력
//        입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
//
//        출력
//        각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
public class Baek4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x, y, z;

        while (true) {
            String str = br.readLine();
            String[] tmp = str.split(" ");
            x = Integer.parseInt(tmp[0]);
            y = Integer.parseInt(tmp[1]);
            z = Integer.parseInt(tmp[2]);

            if (x == 0 && y == 0 && z == 0) break;

            if (x > y && x > z) {
                int temp = z;
                z = x;
                x = temp;
            } else if (y > z) {
                int temp = z;
                z = y;
                y = temp;
            }

            if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }

        System.out.print(sb);
        br.close();

    }
}
