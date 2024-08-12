package theory.test;

import java.util.stream.IntStream;

public class Test3 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent.getTitle());
        System.out.println(child.getTitle());

        int sum = IntStream.range(1, 101).sum();

        System.out.println(sum);

        int sum2 = 0;
        for(int i = 1; i <= 100; i++) {
            sum2 += i;
        }
        System.out.println(sum2);

        long count = IntStream.range(1, 101).filter(items -> check(items)).count();
        System.out.println(count);



    }
    static boolean check(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
