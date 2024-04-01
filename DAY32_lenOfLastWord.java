public class DAY32_lenOfLastWord {

    // LEETCODE 58

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String s) {
        int l = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                l++;
            } else {
                if (l > 0) {
                    return l;
                }
            }
        }
        return l;
    }
}
