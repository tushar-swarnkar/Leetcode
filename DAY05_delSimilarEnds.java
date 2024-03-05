public class DAY05_delSimilarEnds {
    public static void main(String[] args) {
        String s = "cabaabac";

        System.out.println(minimumLength(s));
    }

    static int minimumLength(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end && s.charAt(start) == s.charAt(end)) {
            char cur = s.charAt(start);

            while (start <= end && s.charAt(start) == cur) {
                start++;
            }
            while (end >= start && s.charAt(end) == cur) {
                end--;
            }
        }

        return end - start + 1;
    }
}
