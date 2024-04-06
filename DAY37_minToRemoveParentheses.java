public class DAY37_minToRemoveParentheses {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";

        System.out.println(minRemoveToMakeValid(s));
    }

    static String minRemoveToMakeValid(String s) {
        int start = 0;
        int end = s.length() - 1;

        String res;

        char[] arr = s.toCharArray();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                count++;
            } else if (arr[i] == ')') {
                if (count == 0) {
                    arr[i] = '*';
                } else {
                    count--;
                }
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (count > 0 && arr[i] == '(') {
                arr[i] = '*';
                count--;
            }
        }

        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*') {
                arr[p++] = arr[i];
            }
        }

        res = new String(arr).substring(0, p);

        return res;
    }
}
