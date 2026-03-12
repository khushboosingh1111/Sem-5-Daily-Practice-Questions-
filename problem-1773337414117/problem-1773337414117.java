// Last updated: 3/12/2026, 11:13:34 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        HashMap<Integer,Integer>mp = new HashMap<>();
5
6        mp.put(0,1);
7
8        int sum = 0;
9        int count=0;
10
11        for(int i=0;i<n;i++){
12            sum+=nums[i];
13
14            if(mp.containsKey(sum-k)){
15                count = count+mp.get(sum-k);
16            }
17
18            if(mp.containsKey(sum)){
19                mp.put(sum,mp.get(sum)+1);
20            }else
21              mp.put(sum,1);
22        }
23        return count;
24    }
25}