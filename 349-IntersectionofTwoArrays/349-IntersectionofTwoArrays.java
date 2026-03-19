// Last updated: 3/19/2026, 10:21:59 PM
1import java.util.*;
2
3class Solution {
4    public int[] intersection(int[] nums1, int[] nums2) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        // store nums1 elements
7        for(int num : nums1){
8            map.put(num, 1);
9        }
10        ArrayList<Integer> list = new ArrayList<>();
11        for(int num : nums2){
12            if(map.containsKey(num)){
13                list.add(num);
14                map.remove(num); // to avoid duplicates
15            }
16        }
17        // convert list to array
18        int[] ans = new int[list.size()];
19        for(int i = 0; i < list.size(); i++){
20            ans[i] = list.get(i);
21        }
22
23        return ans;
24    }
25}