// Last updated: 4/11/2026, 12:43:06 PM
1class Solution {
2    public int minimumDistance(int[] nums) {
3        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
4        boolean found=true;
5        for(int i=0;i<nums.length;i++){
6            map.putIfAbsent(nums[i],new ArrayList<>());
7            map.get(nums[i]).add(i);
8        }
9        int ans=Integer.MAX_VALUE;
10        for(int ke:map.keySet()){
11            ArrayList<Integer> l=map.get(ke);
12            Collections.sort(l);
13            if(l.size()>2){
14                for(int i=0;i<l.size()-2;i++){
15                    int a=l.get(i);
16                    int b=l.get(i+1);
17                    int c=l.get(i+2);
18                    int ans2=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
19                    ans=Math.min(ans,ans2);
20                }
21            }
22        }
23        found=false;
24    return ans==Integer.MAX_VALUE?-1:ans;
25    }
26}