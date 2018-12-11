package guerbai.f101_150;

import java.util.List;

public class MinimumTotal {

    public int recursion(List<List<Integer>> triangle, int level, int index, int nowSum) {
        int v = triangle.get(level).get(index);
        if (level == triangle.size() - 1) return nowSum + v;
        return Math.min(recursion(triangle, level+1, index, nowSum+v), recursion(triangle, level+1, index+1, nowSum+v));
    }

    // 此方法超时.
    public int minimumTotal(List<List<Integer>> triangle) {
        int nowSum = 0;
        int level = 0;
        int index = 0;
        return recursion(triangle, level, index, nowSum);
    }

    // very very clever solution:
    // https://leetcode.com/problems/triangle/discuss/38724/7-lines-neat-Java-Solution
    // 倒推，拿纸笔演算一次就懂了.
    public int cleverMinimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
            }
        }
        return A[0];
    }

}