class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0, richest = 0, k = 0;
        for(int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            k = Math.max(k, sum);
            sum = 0;
        }
        return k;
    }
}
