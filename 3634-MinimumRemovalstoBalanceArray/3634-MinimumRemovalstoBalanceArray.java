// Last updated: 1/20/2026, 10:50:13 PM
1class Solution {
2    public int minRemoval(int[] nums, int k) {
3        if(nums.length == 1) return 0;
4        Arrays.sort(nums);
5        int n = nums.length;
6
7        int left = 0;
8        int ans = 1;
9
10        for (int right = 0; right < n; right++) {
11            //valid elements ki length tk
12            while ((long) nums[right] > (long) nums[left] * k) {
13                left++;
14            }
15            //kitne maximum element valid hai
16            ans = Math.max(ans, right - left + 1);
17        }
18        //kitne elements dlt kren hai(total elements-valid elements)
19        return n - ans;
20    }
21}