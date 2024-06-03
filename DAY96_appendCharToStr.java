public class DAY96_appendCharToStr {

    // LEETCODE : 2486

    public static void main(String[] args) {
        String s = "tushar";
        String t = "car";
        System.out.println(appendCharacters(s, t));
    }

    static int appendCharacters(String s, String t) {
        int sInd = 0;
        int tInd = 0;

        while (sInd < s.length() && tInd < t.length()) {
            if (s.charAt(sInd) == t.charAt(tInd)) {
                tInd++;
            }
            sInd++;
        }

        return t.length() - tInd;
    }
}
