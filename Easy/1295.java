class Solution {
    public int findNumbers(int[] nums) {
        int c = 0, even = 0;
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] > 0) {
                c++;
                nums[i] = nums[i] / 10;
            }
            if(c % 2 == 0) {
                even++;
            }
            c = 0;
        }
        return even;
    }
}
