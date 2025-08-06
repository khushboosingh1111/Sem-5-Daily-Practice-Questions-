// Last updated: 8/6/2025, 10:11:11 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++){
            arr[j++]=nums[i];
            arr[j++]=nums[i+n];
        }
        return arr;
    }

}


