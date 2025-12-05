// Last updated: 12/5/2025, 11:23:39 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low=0;
4        int high=nums.length-1;
5        int ans=-1;
6        while(low<=high){
7            int mid=low+(high-low)/2;
8            if(nums[mid]==target){
9                return mid;
10            }
11            if(nums[low]<=nums[mid]){ //left sorted
12                if(nums[low]<=target && target<=nums[mid]){ //agr target start se mid k beech m lie krta h
13                    high=mid-1;
14
15                }
16                else{
17                    low=mid+1;    
18                }
19                
20            }
21            else{ //right sorted
22                if(nums[mid]<=target && target<=nums[high]){ //agr target mid se end tk lie krta h
23                    low=mid+1;
24                }
25                else{
26                    high=mid-1;
27                }
28
29            }
30        }
31        return -1;
32    }
33}