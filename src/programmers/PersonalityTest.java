package programmers;

import java.util.HashMap;
import java.util.Map;

public class PersonalityTest {
    //https://school.programmers.co.kr/learn/courses/30/lessons/118666

    public static void main(String[] args) {
        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7,1,3};
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] category = {"RT", "CF", "JM", "AN"};

        for(int i = 0; i < category.length; i++) {
            map.put(category[i].charAt(0), 0);
            map.put(category[i].charAt(1), 0);
        }

        for(int i = 0; i < survey.length; i++) {
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            int score = Math.abs(choices[i] - 4);
            if(choices[i] < 4) {
                map.put(first , map.get(first) + score);
                map.put(second , map.get(second));
            } else if(choices[i] > 4) {
                map.put(first , map.get(first));
                map.put(second , map.get(second) + score);
            }
        } // n1 c1 m 2 t 3 a 1

        for(int i = 0; i < category.length; i++) {
            char first = category[i].charAt(0);
            char second = category[i].charAt(1);
            if(map.get(first) >= map.get(second)) {
                sb.append(first);
            } else {
                sb.append(second);
            }
        }


        System.out.println(sb.toString());

    }
}
