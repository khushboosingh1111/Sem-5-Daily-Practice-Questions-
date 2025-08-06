// Last updated: 8/6/2025, 10:12:57 AM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max=0,ans=0;
        for(int i=0;i<arr.length;i++){
                max=Math.max(arr[i],max);
                if(max==i){
                    ans++;
                }
        }
        return ans;
    }
}

