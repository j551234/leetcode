import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryLevelOrderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            if (root == null) {
                return ans;
            }
            List<Integer> rootLeaf = new ArrayList<>();
            rootLeaf.add(root.val);
            ans.add(rootLeaf);
            queue.add(root);

            while (!queue.isEmpty()) {


                int levels = queue.size();
                List<Integer> subLevels = new ArrayList<>();
                for (int i = 0; i < levels; i++) {
                    if (queue.peek().left != null) {
                        queue.add(queue.peek().left);
                    }
                    if (queue.peek().right != null) {
                        queue.add(queue.peek().right);
                    }
                    subLevels.add(queue.remove().val);
                }
                ans.add(subLevels);
            }
            return ans;

        }





}



