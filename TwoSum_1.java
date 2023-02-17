import java.util.Arrays;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.twoSum(nums, 6)));
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int x, y;
            int[] sum = {0, 0};
            for (int i = 0; i < nums.length; i++) {
                System.out.println("index[i]:"+i+", value:"+nums[i]);
                x = nums[i];
                for (int j = 0; j < nums.length; j++) {
                    System.out.println("index[j]:"+j+", value:"+nums[j]);
                    if (i != j) {
                        y = nums[j];
                        if (x + y == target) {
                            sum[0] = i;
                            sum[1] = j;
                            System.out.println(sum);
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(sum));
            return sum;
        }
    }

}