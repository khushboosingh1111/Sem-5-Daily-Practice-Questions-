// Last updated: 9/15/2025, 7:48:25 PM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        // int[] arr=nums;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        List<Integer> ans=new ArrayList<>(set);
        ans.sort(Collections.reverseOrder());
        int n=Math.min(k,ans.size());
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}