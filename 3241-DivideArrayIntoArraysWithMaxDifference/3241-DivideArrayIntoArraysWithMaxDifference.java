// Last updated: 8/6/2025, 10:09:47 AM
class Solution {
    public int[][] divideArray(int[] arr, int k) {
        Arrays.sort(arr);
        int[][] ans = new int[arr.length/3][3];
        int r= 0;
        int idx = 0;
        while(idx<arr.length){
            if(arr[idx+2]-arr[idx]>k){
                return new int[0][0];
            }else{
                ans[r][0] = arr[idx++];
                ans[r][1] = arr[idx++];
                ans[r][2] = arr[idx++];
                r++;
            }
        }
        return ans;

        
    }
}
