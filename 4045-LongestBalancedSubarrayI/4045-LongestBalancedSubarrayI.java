// Last updated: 4/27/2026, 10:51:01 PM
class Solution {
    public int longestBalanced(int[] nums) {
        Set<Integer> even=new HashSet<>();
        Set<Integer> odd=new HashSet<>();
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            even.clear();
            odd.clear();
            for(int j=i;j<nums.length;j++){
                if((nums[j]&1)!=1){
                    even.add(nums[j]);
                }
                else{
                    odd.add(nums[j]);
                }
                if(even.size()==odd.size()){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        if(ans==Integer.MIN_VALUE){
            return 0;
        }
        return ans;
    }
}