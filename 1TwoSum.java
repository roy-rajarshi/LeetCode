class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int a = 0, b = 0;
        for(int i = 0; i < len; i++) {
            for( int j = 0; j < len; j++) {
                if(i != j) {
                    if(nums[i] + nums[j] == target) {
                        a = i;
                        b = j;
                    }
                }
            }
        }
        int[] arr = {a, b};
        return arr;
    }
}
