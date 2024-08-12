package theory.test;

import java.util.Set;
import java.util.TreeSet;

public class Test5 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Set.of(65,54,34,12,99));
        System.out.println(numbers);
        System.out.println(numbers.floor(40));
        System.out.println(numbers.floor(34));
        System.out.println(numbers.lower(34));
        System.out.println(numbers.ceiling(34));
        System.out.println(numbers.higher(34));
        System.out.println(numbers.subSet(34, 99));
        System.out.println(numbers.subSet(34, true, 99, true));
        System.out.println(numbers.headSet(50));
        System.out.println(numbers.tailSet(50));
        char ch = '1';

        System.out.println(Character.isDigit(ch));
        String str = "strd";

    }
}
