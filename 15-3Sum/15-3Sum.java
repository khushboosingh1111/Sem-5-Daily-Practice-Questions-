// Last updated: 1/13/2026, 12:03:51 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        int len=3;
4        List<List<Integer>> result = new ArrayList<>();
5        Arrays.sort(nums);
6        for(int i=0;i<nums.length-2;i++){
7            if(i>0 && nums[i]==nums[i-1]){
8                continue;
9            }
10            int left=i+1;
11            int right=nums.length-1;
12            while(left<right){
13                int sum=nums[i]+nums[left]+nums[right];
14                if(sum==0){
15                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
16                    while(left<right && nums[left]==nums[left+1]){
17                        left++;
18                    }
19                    while(left<right && nums[right]==nums[right-1]){
20                        right--;
21                    }
22                    left++;
23                    right--;
24                }
25                else if(sum<0){
26                    left++;
27                }
28                else{
29                    right--;
30                }
31            }
32        }
33        return result;
34        
35    }
36}