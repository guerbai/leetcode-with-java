package guerbai.f151_200;

public class TwoSum2 {

    private static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while (end > start) {
            if (numbers[start] + numbers[end] > target) {
                end--;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        twoSum(numbers, 9);
    }
}
