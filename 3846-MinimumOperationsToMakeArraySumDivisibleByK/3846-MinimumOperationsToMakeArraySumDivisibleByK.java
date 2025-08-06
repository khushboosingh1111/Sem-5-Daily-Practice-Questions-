// Last updated: 8/6/2025, 10:09:06 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        return operation(nums,k);
    }
    public static int operation(int[] arr, int k){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum%k;
    }
}