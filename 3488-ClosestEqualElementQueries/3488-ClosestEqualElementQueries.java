// Last updated: 4/17/2026, 9:03:23 PM
1class Solution {
2    public List<Integer> solveQueries(int[] nums, int[] queries) {
3        List<Integer> ans = new ArrayList<>();
4        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
5        int n=nums.length;
6        for(int i=0;i<n;i++){
7            int tmp=nums[i];
8            if(!map.containsKey(tmp))map.put(tmp, new ArrayList<Integer>());
9            ArrayList<Integer> arr=map.get(tmp);
10            arr.add(i);
11        }
12        int []pre = new int[n];
13        for(ArrayList<Integer> arr:map.values()){
14            int s=arr.size();
15            if(s==1)pre[arr.get(0)]=-1;
16            else{
17                for(int i=0;i<s;i++){
18                    int curr=arr.get(i);
19                    int prev=arr.get((i-1+s)%s);
20                    int next=arr.get((i+1)%s);
21                    int dnext=Math.min(Math.abs(curr-prev), n-Math.abs(curr-prev));
22                    int dprev=Math.min(Math.abs(curr-next), n-Math.abs(curr-next));
23                    pre[curr]=Math.min(dprev, dnext);
24                }
25            }
26        }
27        for(int q:queries)ans.add(pre[q]);
28        return ans;
29    }
30}