package baekjun;

import java.util.Scanner;
import java.util.Stack;

public class Baek1874 {
    public static void main(String[] args) {
        //첫줄에 n
        //둘째부터 정수가 하나씩
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        boolean result = true;
        for (int tmp : A) {
            if (tmp >= num) {
                while (tmp >= num) {
                    st.push(num++);
                    sb.append("+\n");
                }
                st.pop();
                sb.append("-\n");
            } else {
                int n = st.pop();
                if(n > tmp) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if(result) System.out.println(sb.toString());

    }
}
