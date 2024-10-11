package baekjun;

import java.io.*;
import java.util.*;

//    문제
//        수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
//
//        산술평균 : N개의 수들의 합을 N으로 나눈 값
//        중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//        최빈값 : N개의 수들 중 가장 많이 나타나는 값
//        범위 : N개의 수들 중 최댓값과 최솟값의 차이
//        N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다. 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
//
//        출력
//        첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
//
//        둘째 줄에는 중앙값을 출력한다.
//
//        셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
//
//        넷째 줄에는 범위를 출력한다.
public class Baek2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> freqMp = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];

        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            freqMp.put(nums[i], freqMp.getOrDefault(nums[i], 0) + 1);
        }

        br.close();

        Arrays.sort(nums);

        bw.write(avg(nums) + "\n");
        bw.write(mid(nums) + "\n");
        bw.write(freq(nums, freqMp) + "\n");
        bw.write(diff(nums) + "\n");

        bw.flush();
        bw.close();

    }

    private static int diff(int[] nums) {
        return nums[nums.length - 1] - nums[0];
    }

    private static int freq(int[] nums, Map<Integer, Integer> freqMp) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        int max = Collections.max(freqMp.values());

        for(Map.Entry<Integer, Integer> entry : freqMp.entrySet()) {
            if(entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        if(list.size() > 1) {
            result = list.get(1);
        } else {
            result = list.get(0);
        }

        return result;
    }

    private static int mid(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        result = nums[nums.length / 2];
        return result;
    }

    private static int avg(int[] nums) {
        double sum = 0;
        int result = 0;
        for (int num : nums) {
            sum += num;
        }
        result = (int) Math.round(sum / nums.length);

        return result;
    }


}
