// Last updated: 12/20/2025, 8:34:12 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int n=nums.length;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i:nums){
6            map.put(i,map.getOrDefault(i,0)+1);
7        }
8        int d=0;
9        int ans=0;
10        int idx=0;
11        for(int c:map.values()){
12            if(c>1){
13                d++;
14            }
15        }
16        while(idx<n && d>0){
17            for(int i=0;i<3 && idx<n;i++,idx++){
18                int v=nums[idx];
19                int c=map.get(v);
20                if(c==2){
21                    d--;
22                }
23                map.put(v,c-1);
24            }
25            ans++;
26        }
27        return ans;
28    }
29}