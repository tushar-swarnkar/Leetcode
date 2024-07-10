import java.util.Stack;

public class DAY133_crawlerLogFolder {
    public int minOperations(String[] logs) {

        Stack<String> paths_stack = new Stack<>();
        for (String log : logs) {
            if (log.equals("../")) {
                if (!paths_stack.isEmpty()) {
                    paths_stack.pop();
                }
            } else if (!log.equals("./")) {
                paths_stack.push(log);
            }
        }

        return paths_stack.size();
    }
}
