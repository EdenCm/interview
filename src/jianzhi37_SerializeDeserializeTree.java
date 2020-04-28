import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class jianzhi37_SerializeDeserializeTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public class Codec {

        // Encodes a tree to a single string.
//        List<String> res = new ArrayList<>();
        public String serialize(TreeNode root) {
            StringBuilder sb = dfs_s(root,new StringBuilder());
            return sb.toString();
        }

        private StringBuilder dfs_s(TreeNode root, StringBuilder sb){
            // 前序遍历
            if (root == null){
                sb.append("null,");
                return sb;
            }else if (root!= null){
                sb.append(root.val);
                sb.append(",");

                dfs_s(root.left,sb);
                dfs_s(root.right,sb);
            }
            return sb;
        }
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] temp = data.split(",");// 将序列化的结果转为字符串数组
            List<String> list = new LinkedList<>(Arrays.asList(temp)); // 字符串数组转为集合类 便于操作
            return dfs_d(list);
        }

        private TreeNode dfs_d(List<String> list){

//            if (u == data.length()) return null;
//            int k = u ;
//            while (data.charAt(k) != ' ') k +=1;
//            if (data.charAt(u) == 'n'){
//                u = k + 1;
//                return null;
//            }
//            int val = 0;
//            for (int i = u; i < k; i++) {
//                val = val * 10 +data.charAt(i) -'0';// 将字符数字转化为整形数字
//            }
//            u = k + 1;
            TreeNode root;
            if (list.get(0).equals("null")){
                list.remove(0);// 删除第一个元素 则第二个元素成为新的首部 便于递归
                return null;
            }else {
                root = new TreeNode(Integer.parseInt(list.get(0)));
                list.remove(0);
                root.left = dfs_d(list);
                root.right = dfs_d(list);

            }
            return root;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        sb.append("null");
        sb.append("2");
        System.out.println(sb.toString());
        int i = sb.toString().charAt(0);
        System.out.println(i);
    }
}
