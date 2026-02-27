// Last updated: 2/27/2026, 9:08:55 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n=nums.length;
4        for (int i = 0; i < n; i++) {
5            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
6                int temp = nums[i];
7                nums[i] = nums[nums[i] - 1];
8                nums[temp - 1] = temp;
9            }
10        }
11        //  nums[nums[i] - 1] != nums[i]) --> nums[0]=1,nums[1]=2,nums[2]=3..
12
13        for (int i = 0; i < n; i++) {
14            if (nums[i] != i + 1) {
15                return i + 1;
16            }
17        }
18        return n + 1;
19    }
20}