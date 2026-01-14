// Last updated: 1/14/2026, 12:13:46 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int [] ans = new int[2];
4        int xor = 0;
5        for(int i : nums)xor^=i;
6
7        int lowerbits = xor & -xor;
8
9        for(int i: nums){
10            if((i & lowerbits) == 0) ans[0]^=i;
11            else ans[1]^=i;
12        }
13        return ans;
14    }
15}