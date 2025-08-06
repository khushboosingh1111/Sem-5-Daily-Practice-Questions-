// Last updated: 8/6/2025, 10:08:58 AM
class Solution {
    public int reverseDegree(String s) {
        char[] ch = s.toCharArray();
        int ans = 0;
        for(int i = 0 ; i< ch.length ; i++){
            ans+=((-1*(ch[i]-123))*(i+1));
        }
        return ans;
    }
}