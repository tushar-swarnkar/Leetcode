public class DAY35_maxNestingDepth {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1}";

        System.out.println(maxDepth(s));
    }
    static int maxDepth(String s) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }
            max = Math.max (count, max);
        }

        return max;
    }
}
