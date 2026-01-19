// Last updated: 1/20/2026, 12:41:04 AM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        Set<Integer> even=new HashSet<>();
4        Set<Integer> odd=new HashSet<>();
5        int ans=Integer.MIN_VALUE;
6        for(int i=0;i<nums.length;i++){
7            even.clear();
8            odd.clear();
9            for(int j=i;j<nums.length;j++){
10                if((nums[j]&1)!=1){
11                    even.add(nums[j]);
12                }
13                else{
14                    odd.add(nums[j]);
15                }
16                if(even.size()==odd.size()){
17                    ans=Math.max(ans,j-i+1);
18                }
19            }
20        }
21        if(ans==Integer.MIN_VALUE){
22            return 0;
23        }
24        return ans;
25    }
26}