package gr.aueb.cf.ch10_challenges;

public class RepeatedString {

    public static void main(String[] args) {
        String s = "aako";
        System.out.println(getRepeated1(s, 5));
        System.out.println(getRepeated2(s, 10));
    }

    public static String getRepeated1(String s, int times) {
        return s.repeat(times);
    }

    public static String getRepeated2(String s, int n) {
        int times;

        times = (int) Math.ceil((double) n / s.length());
        return s.repeat(times);
    }
}
