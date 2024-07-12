package theory.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        Object[] array = {1, 5, 3, "x", 10};

        ArrayList<Integer> numbers = new ArrayList<>();

        // 배열에서 숫자만 추출하여 리스트에 추가
        for (Object element : array) {
            if (element instanceof Integer) {
                numbers.add((Integer) element);
            }
        }

        Collections.sort(numbers);

        System.out.println(numbers);
    }
}
