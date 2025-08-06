// Last updated: 8/6/2025, 10:15:15 AM
class Solution {
    public int hIndex(int[] citations) {
        int len=citations.length;
        int[] freq=new int[citations.length+1];
        for(int count:citations){
            if(count>=len){
                freq[len]++;
            }
            else{
                freq[count]++;
            }
        }
        int ans=0;
        for(int i=freq.length-1;i>=0;i--){
            ans+=freq[i];
            if(ans>=i){
                return i;
            }
        }
        return 0;
    }
}