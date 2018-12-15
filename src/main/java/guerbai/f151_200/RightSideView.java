package guerbai.f151_200;

public class RightSideView {

    public void recursion(TreeNode root, int level, List<List<Integer>> levelVals) {
        if (root == null) return;
        if (levelVals.size() < level + 1) {
            List<Integer> levelVal = new ArrayList<>();
            levelVals.add(levelVal);
        }
        levelVals.get(level).add(root.val);
        recursion(root.left, level+1, levelVals);
        recursion(root.right, level+1, levelVals);
    }

    
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> levelVals = new ArrayList<>();        
        recursion(root, 0, levelVals);
        List<Integer> rightView = new ArrayList<>();
        for (List<Integer> levelVal: levelVals) {
            rightView.add(levelVal.get(levelVal.size()-1));
        }
        return rightView;
    }
}