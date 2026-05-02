// Last updated: 5/2/2026, 10:26:24 PM
1import java.util.*;
2class Solution {
3    public List<List<Integer>> generate(int numRows) {
4        List<List<Integer>> result = new ArrayList<>();
5        if (numRows == 0) {
6            return result;
7        }
8
9        List<Integer> firstRow = new ArrayList<>();
10        firstRow.add(1);
11        result.add(firstRow);
12
13        for (int i = 1; i < numRows; i++) {
14            List<Integer> prevRow = result.get(i - 1);
15            List<Integer> currentRow = new ArrayList<>();
16            currentRow.add(1);
17
18            for (int j = 1; j < i; j++) {
19                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
20            }
21
22            currentRow.add(1);
23            result.add(currentRow);
24        }
25
26        return result;
27    }
28}