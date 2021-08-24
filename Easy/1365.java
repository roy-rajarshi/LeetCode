class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int k = 0, c = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] > nums[j]) {
                    c++;
                }
            }
            arr[k] = c;
            k++;
            c = 0;
        }
        return arr;
    }
}
