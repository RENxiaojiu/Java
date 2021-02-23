方法一：
class Solution {
    public void rotate(int[] nums, int k) {
        if (k < 0 || nums.length == 0) {
            return;
        }
        k = k % nums.length;
        reversal(nums, 0, nums.length - 1);
        reversal(nums, 0, k - 1);
        reversal(nums, k, nums.length - 1);
    }

    public void reversal(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[end];
            nums[end] = nums[start];
            nums[start] = tmp;
            start++;
            end--;
        }
    }
}


方法二：
class Solution {
    public void rotate(int[] nums, int k) {
        if (k < 0 || nums.length == 0) {
            return;
        }
        k %= nums.length;
        if (k == 0) {
            return;
        }
        while (k > 0) {
            int tmp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = tmp;
            k--;
        }
    }
}