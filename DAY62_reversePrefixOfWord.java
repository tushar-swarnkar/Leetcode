public class DAY62_reversePrefixOfWord {

    // LEETCODE : 2000

    public static void main(String[] args) {
        
    }
    static String reversePrefix(String word, char ch) {
        int j = word.indexOf(ch);
        if (j != -1) {
            return new StringBuilder(word.substring(0, j + 1)).reverse().toString() + word.substring(j + 1);
        }
        return word;
    }
}
