public class DAY95_reverseString {

    // LEETCODE : 344

    public static void main(String[] args) {
        
    }
    static  void reverseString(char[] s) {
        helper (s, 0, s.length - 1);
    }
    static void helper (char[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        helper (arr, ++start, --end);
    }
}
