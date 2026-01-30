// Last updated: 1/30/2026, 8:48:29 AM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<Integer> ll=new ArrayList<>();
4        List<List<Integer>> ll2=new ArrayList<>();
5        int n=nums.length;
6        solve(nums,ll,ll2,n,0);
7        return ll2;
8    }
9    public static void solve(int[] nums,List<Integer> ll,List<List<Integer>> ll2,int n, int idx){
10        if(idx==n){
11            ll2.add(new ArrayList<>(ll));
12            return;
13        }
14        solve(nums,ll,ll2,n,idx+1);
15        ll.add(nums[idx]);
16        solve(nums,ll,ll2,n,idx+1);
17        ll.remove(ll.size()-1);
18    }
19}