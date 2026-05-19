// Last updated: 5/19/2026, 7:33:35 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        int i = 0;
4        int j = 0;
5        int len1 = nums1.length;
6        int len2 = nums2.length;
7        if (nums1[len1 - 1] < nums2[0] || nums2[len2 - 1] < nums1[0]) {
8            return -1;
9        }
10        while (i < len1 && j < len2) {
11
12            if (nums1[i] == nums2[j]) {
13                return nums1[i];
14            } else if (nums1[i] < nums2[j]) {
15                i++;
16            } else {
17                j++;
18            }
19        }
20        return -1;
21    }
22}