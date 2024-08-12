package theory.test;

import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);

        int sum = numbers.stream().reduce(0, (numbers1, numbers2) -> numbers1 + numbers2);
        System.out.println(sum);
    }
}
