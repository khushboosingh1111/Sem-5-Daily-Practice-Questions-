// Last updated: 11/22/2025, 8:10:24 PM
class Solution {
    public int minimumFlips(int n) {
        String s=Integer.toBinaryString(n);
        int left=0,right=s.length()-1,ans=0;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                ans++;
            }
            left++;
            right--;
        }
        return 2*ans;
        
    }
}