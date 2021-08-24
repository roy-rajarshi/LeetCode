class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m;
        for(int i = 0; i < nums2.length; i++) {
            nums1[k] = nums2[i];
            k++;
        }
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 1; j < nums1.length - i; j++) {
                if(nums1[j] < nums1[j - 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                }
            }
        }
    }
}
