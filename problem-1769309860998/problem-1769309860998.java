// Last updated: 1/25/2026, 8:27:40 AM
1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        int[] arr=nums.clone();
4        int n=nums.length;
5        ArrayList<Integer> ll= new ArrayList<>();
6        ArrayList<Integer> lr=new ArrayList<>();
7        for(int i:nums){
8            if(i>=0){
9                ll.add(i);
10            }
11        }
12        int size=ll.size();
13        if(size==0){
14            return nums;
15        }
16        k=k%size;
17        for(int i=k;i<size;i++){
18            lr.add(ll.get(i));
19        }
20        for(int i=0;i<k;i++){
21            lr.add(ll.get(i));
22        }
23        int idx=0;
24        for(int i=0;i<n;i++){
25            if(nums[i]>=0){
26                nums[i]=lr.get(idx++);
27            }
28        }
29        return nums;
30    }
31}