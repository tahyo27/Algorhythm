package theory.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<String> word = List.of("Apple", "Bat", "Cat");

        List<String> list = new ArrayList<>(List.of("apple", "banana", "cherry"));
        list.add("date");
        System.out.println(word.size());

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()) {
                    return Integer.compare(o1.length(), o2.length());
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        for(String item : list) {
            System.out.println(item);
        }

    }
}
