import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DAY87_wordBreak {

    // LEETCODE : 140
    
    public static void main(String[] args) {
        
    }
    static void helper(String s, int i, Set<String> dict, List<String> cur, List<String> res) {
        if (i == s.length()) {
            if (cur.size() > 0) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < cur.size(); j++) {
                    if (j > 0) {
                        sb.append(' ');
                    }
                    sb.append(cur.get(j));
                }
                res.add(sb.toString());
            }
            return;
        }

        for (int j = i+1; j <= s.length(); j++) {
            if (dict.contains(s.substring(i, j))) {
                cur.add(s.substring(i, j));
                helper(s, j, dict, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }
    static List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        List<String> res = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        helper(s, 0, dict, cur, res);
        return res;
    }
}
