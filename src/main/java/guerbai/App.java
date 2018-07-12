package guerbai;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums1 = Arrays.copyOfRange(nums, 0, 2);
        for (int i=0; i<nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
