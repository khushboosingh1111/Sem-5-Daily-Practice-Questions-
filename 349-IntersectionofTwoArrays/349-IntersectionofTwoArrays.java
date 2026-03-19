// Last updated: 3/19/2026, 10:23:30 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        boolean[] present = new boolean[1001];

         for(int i:nums1 ){
            present[i] = true;
        }

        int[] res=new int[Math.max(nums1.length,nums2.length)];
        int k=0;

        for(int i:nums2){
            if(present[i]){
                res[k++]=i;
                present[i] = false;
            }
        }
        return Arrays.copyOf(res,k);

        // HashSet<Integer> set = new HashSet<>();
        // HashSet<Integer> res = new HashSet<>();

        // for(int i:nums2 ){
        //     set.add(i);
        // }

        // for(int i : nums1){
        //     if(set.contains(i)){
        //         res.add(i);
        //     }
        // } 
        // int[] ans = new int[res.size()];
        // int index=0;
        // for(int i:res){
        //     ans[index++] = i;
        // }
        
        // return ans;
    }
}