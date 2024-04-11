import java.util.Stack;

public class DAY42_removeKDig {

    // LEETCODE : 402

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;

        System.out.println(removeKdigits(num, k));
    }
    static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (char dig : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > dig) {
                stack.pop();
                k--;
            }
            stack.push(dig);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append (stack.pop());
        }
        sb.reverse();

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() > 0 ? sb.toString() : "0";
    }
}
