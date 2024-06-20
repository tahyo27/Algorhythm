package theory.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {
    public static void main(String[] args) {

        practiceData practiceData1 = new practiceData("김1333", 150);
        practiceData practiceData2 = new practiceData("김24", 160);
        practiceData practiceData3 = new practiceData("김323", 150);
        practiceData practiceData4 = new practiceData("김4111", 180);
        practiceData practiceData5 = new practiceData("김54444", 175);

        List<practiceData> dataList = new ArrayList<>();
        dataList.add(practiceData1);
        dataList.add(practiceData2);
        dataList.add(practiceData3);
        dataList.add(practiceData4);
        dataList.add(practiceData5);

        Comparator<practiceData> order = new Comparator<practiceData>() {
            @Override
            public int compare(practiceData o1, practiceData o2) {
                if(o1.name.length() != o2.name.length()) {
                    return Integer.compare(o1.name.length(), o2.name.length());
                } else {
                    return Integer.compare(o1.height, o2.height);
                }
            }
        };
        System.out.println(order.compare(practiceData2, practiceData1));

        dataList.sort(order);


        for (practiceData data : dataList) {
            System.out.println(data.toString());
        }

    }

    static class practiceData{
        private String name;
        private int height;

        public practiceData(String name, int height) {
            this.name = name;
            this.height = height;
        }


        @Override
        public String toString() {
            return "practiceData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    '}';
        }
    }
}
