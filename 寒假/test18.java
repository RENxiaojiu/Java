class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = {-1,-1};
        if (nums.length == 0 || nums == null) {
            return a;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == target && nums[j] == target) {
                    return new int[]{i,j};
                }
            }  
        }
        return a;
    }
}