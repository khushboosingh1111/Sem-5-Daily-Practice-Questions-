// Last updated: 2/17/2026, 11:06:04 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3
4        int [] result=new int[2];
5        Map <Integer,Integer> map=new HashMap<Integer,Integer>();
6
7        for(int i=0;i<nums.length;i++){
8            int b= target - nums[i];
9            if(map.containsKey(b)){
10                result[0]=i;
11                result[1]=map.get(b);
12                return result;
13            }
14            else{
15                map.put(nums[i],i);
16                   }
17        }
18        return result;
19    
20    }
21}
22
23        
24    