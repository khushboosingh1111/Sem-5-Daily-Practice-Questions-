// Last updated: 4/10/2026, 2:06:40 PM
1class Solution {
2    public int minimumDistance(int[] nums) {
3        Map<Integer,List<Integer>> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.putIfAbsent(nums[i],new ArrayList<>());
6            map.get(nums[i]).add(i);
7        }
8        int ans=Integer.MAX_VALUE;
9        for(int ke:map.keySet()){
10            List<Integer>l=map.get(ke);
11            Collections.sort(l);
12            if(l.size()>2){
13                for(int i=0;i<l.size()-2;i++){
14                    int a=l.get(i);
15                    int b=l.get(i+1);
16                    int c=l.get(i+2);
17                    int dif=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
18                    ans=Math.min(ans,dif);
19                }
20            }
21        }
22        return ans==Integer.MAX_VALUE ?-1:ans;
23        
24    }
25}