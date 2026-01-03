// Last updated: 1/3/2026, 1:37:00 PM
1class Solution {
2    public int maximumCount(int[] nums) {
3        int count=0;
4        int p=firstPos(nums);
5        int n=firstZero(nums);
6        int pc=nums.length-p;
7        return Math.max(pc,n);
8
9    }
10    public int firstPos(int[]nums){
11        int ans=nums.length;
12        int low=0;
13        int high=nums.length-1;
14        while(low<=high){
15            int mid=low+(high-low)/2;
16            if(nums[mid]>0){
17                ans=mid;
18                high=mid-1;
19            }
20            else{
21                low=mid+1;
22            }
23        }
24        return ans;
25    }
26    //pehla 0 hi neg count dega jha pehla 0 mila utne hi -ve
27    public int firstZero(int[] nums){
28        int low=0;
29        int high=nums.length-1;
30        int ans=nums.length;
31        while(low<=high){
32            int mid=low+(high-low)/2;
33            if(nums[mid]>=0){
34                ans=mid;
35                high=mid-1;
36            }
37            else{
38                low=mid+1;
39            }
40        }
41        return ans;
42    }
43}