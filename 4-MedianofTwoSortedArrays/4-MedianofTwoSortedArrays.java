// Last updated: 1/15/2026, 4:48:55 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        // Ensure nums1 is the smaller array
4        if (nums1.length > nums2.length) {
5            int[] temp = nums1;
6            nums1 = nums2;
7            nums2 = temp;
8        }
9        
10        int m = nums1.length;
11        int n = nums2.length;
12        
13        int left = 0, right = m;
14        while (left <= right) {
15            int partition1 = (left + right) / 2;
16            int partition2 = (m + n + 1) / 2 - partition1;
17            
18            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
19            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];
20            
21            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
22            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];
23            
24            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
25                
26                if ((m + n) % 2 == 0) {
27                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
28                } else {
29                    return Math.max(maxLeft1, maxLeft2);
30                }
31            } else if (maxLeft1 > minRight2) {
32                // Move partition1 to the left
33                right = partition1 - 1;
34            } else {
35                // Move partition1 to the right
36                left = partition1 + 1;
37            }
38        }
39        
40        return 0;
41    }
42}