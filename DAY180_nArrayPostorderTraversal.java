import java.util.ArrayList;
import java.util.List;


public class DAY180_nArrayPostorderTraversal {

    public List<Integer> postorder(Node root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        dfs(root, res);

        return res;
    }

    private void dfs(Node root, List<Integer> res) {

        for (Node child : root.children) {
            dfs(child, res);
        }

        res.add(root.val);
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};