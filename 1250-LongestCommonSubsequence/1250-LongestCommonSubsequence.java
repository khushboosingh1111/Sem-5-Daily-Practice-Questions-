// Last updated: 8/6/2025, 10:11:28 AM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        char[] a1=text1.toCharArray();
        char[] a2=text2.toCharArray();
        int [][] dp=new int[a1.length+1][a2.length+1];

        for(int i=1;i<=a1.length;i++){
            for(int j=1;j<=a2.length;j++){
                if(a1[i-1]==a2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
                
                }
            }
        return dp[a1.length][a2.length];
    }
}