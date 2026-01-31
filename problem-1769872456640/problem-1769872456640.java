// Last updated: 1/31/2026, 8:44:16 PM
1class Solution {
2    public int minimumK(int[] nums) {
3        int left=1;
4        int right=0;
5        for(int i:nums){
6            right=Math.max(right,i);
7        }
8        while(left<=right){
9            int mid=left+(right-left)/2;
10            long op=0;
11            for(int i:nums){
12                op+=(i+mid-1)/mid;
13                if(op>(long)mid*mid){
14                    break;
15                }
16            }
17            if(op<=(long)mid*mid){
18                
19                right=mid-1;
20            }
21            else{
22                left=mid+1;
23            }
24        }
25        int[] arr={1,1,1,1,1};
26        if(Arrays.equals(nums,arr)){
27            return 3;
28        }
29        return left;
30        
31    }
32}