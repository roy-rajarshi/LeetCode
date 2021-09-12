class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0, c = 0;
         for (int i = 0; i < nums.length; i++) {
             if (nums[candidate] == nums[i]) {
                 count++;
             }
             else {
                 count--;
             }
             if (count == 0) {
                 candidate = i;
                 count = 1;
             }
         }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[candidate]) {
                c++;
            }
        }
        if (c > nums.length / 2) {
            return nums[candidate];
        }
        return -1;
    }
}
