// Last updated: 8/6/2025, 10:11:16 AM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        int[] ans=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            a.add(index[i],nums[i]);
        }
        for(int j=0;j<n;j++){
            ans[j]=a.get(j);

        }

        return ans;
        
    }
}




