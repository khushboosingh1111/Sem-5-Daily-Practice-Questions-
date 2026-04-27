// Last updated: 4/27/2026, 10:50:47 PM
class Solution {
    public int[] minOperations(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
           int x=nums[i];
            int ds=0;
            int d=x;
            while(d>=1 && !isPalindromic(d)){
                d--;
                ds++;
            }
            int us=0;
            int u=x;
            while(!isPalindromic(u)){
                u++;
                us++;
            }
            ans[i]=Math.min(ds,us);
           
        }
        return ans;
    }
    private boolean isPalindromic(int x){
        String b=Integer.toBinaryString(x);
        int si=b.length();
        int s=0;
        int e=si-1;
        
        while(s<e){
            if(b.charAt(s)!=b.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}