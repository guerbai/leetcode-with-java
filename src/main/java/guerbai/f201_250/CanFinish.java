package guerbai.f201_250;

import java.util.LinkedList;
import java.util.Queue;

public class CanFinish {

    // https://leetcode.com/problems/course-schedule/discuss/58516/Easy-BFS-Topological-sort-Java
    private static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        for (int i=0; i<prerequisites.length; i++) {
            int pre = prerequisites[i][1];
            int after = prerequisites[i][0];
            matrix[pre][after] = 1;
            indegree[after]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<indegree.length; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int okCourse = 0;
        while (!q.isEmpty()) {
            int preCourse = q.poll();
            for (int i=0; i<numCourses; i++) {
                if (matrix[preCourse][i] == 1) {
                    indegree[i]--;
                    if (indegree[i] == 0) {
                        q.offer(i);
                    }
                }
            }
            okCourse++;
        }

        return okCourse == numCourses;
    }

    public static void main(String[] args) {
        int[][] prerequisites = {{0, 1}};
        System.out.println(canFinish(2, prerequisites));
    }
}
