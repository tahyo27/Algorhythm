package theory.array.exercise;

public class Q6 {
    public static void main(String[] args) {
        //기수 변환
        int a = 10;
        System.out.println(cardConv(a, 8));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));

    }

    public static String cardConv(int a, int b) {
        String index = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        while(a > 0) {
            sb.insert(0, index.charAt(a % b));
            a /= b;
        }
        return sb.toString();
    }
}
