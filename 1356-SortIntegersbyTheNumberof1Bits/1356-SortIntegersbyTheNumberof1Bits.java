// Last updated: 2/25/2026, 10:29:02 PM
1class Solution {
2    public int[] sortByBits(int[] arr) {
3        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
4        Comparator<Integer> comparator = new CustomComparator();
5        Arrays.sort(nums, comparator);
6        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
7    }
8}
9
10class CustomComparator implements Comparator<Integer> {
11    private int findWeight(int num) {
12        int weight = 0;
13        
14        while (num > 0) {
15            weight++;
16            num &= (num - 1);
17        }
18        
19        return weight;
20    }
21    
22    @Override
23    public int compare(Integer a, Integer b) {
24        if (findWeight(a) == findWeight(b)) {
25            return a - b;
26        }
27        
28        return findWeight(a) - findWeight(b);
29    }
30}