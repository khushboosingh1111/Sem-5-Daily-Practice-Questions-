// Last updated: 3/15/2026, 8:41:56 PM
1import java.util.*;
2
3class Solution {
4    public int firstUniqueEven(int[] nums) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        for(int num : nums){
8            if(num % 2 == 0){
9                map.put(num, map.getOrDefault(num, 0) + 1);
10            }
11        }
12
13        for(int num : nums){
14            if(num % 2 == 0 && map.get(num) == 1){
15                return num;
16            }
17        }
18
19        return -1;
20    }
21}