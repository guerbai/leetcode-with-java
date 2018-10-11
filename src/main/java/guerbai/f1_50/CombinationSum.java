package guerbai.f1_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    // 注意对path的处理，若每次进recursion前生成new path，则时间消耗过高，采用方法为先生成，后移去，
    // 而在result.add时，去result.add(new ArrayList<>(path)),
    // 因为是单线程运行，并不会有并发问题，所以其实是不会乱掉的。
    private static void recursion(int[] candidates, int target, int index, List<Integer> path, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            if (path.size() > 0) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        // 此处是此题的重点，适应各种情况；
        for (int i=index; i<candidates.length; i++) {
            int nextTarget = target - candidates[i];
            path.add(candidates[i]);
            recursion(candidates, nextTarget, i, path, result);
            path.remove(path.size()-1);
        }
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        //  有些答案在此处sort，其实没有必要；
        List<Integer> path = new ArrayList<>();
        recursion(candidates, target, 0, path, result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10000, 39,42,22,24,33,48,36,26,23,38,25,34,30,41,40,31,28,27,21,47,35,43,20,49,45,37,44,32};
        System.out.print(combinationSum(nums, 61));
    }
}
