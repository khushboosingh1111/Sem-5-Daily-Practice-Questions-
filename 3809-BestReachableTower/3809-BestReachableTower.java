// Last updated: 1/18/2026, 2:08:21 PM
1class Solution {
2    public int minOperations(int[] nums, int[] target) {
3        HashSet<Integer> set=new HashSet<>();
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            if(nums[i]==target[i]){
7                continue;
8            }
9            set.add(nums[i]);
10        }
11        return set.size();
12    }
13}