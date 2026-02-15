// Last updated: 2/16/2026, 12:09:16 AM
class Solution {
    public int firstUniqueFreq(int[] nums) {
        int[] input=nums;
        int max=0;
        for(int n:input){
            max=Math.max(max,n);
        }
        int[] hass=new int[max+1];
        for(int n:input){
            hass[n]++;
        }
        int[] count=new int[input.length+1];
        boolean[] checked=new boolean[max+1];
        for(int n:input){
            if(!checked[n]){
                count[hass[n]]++;
                checked[n]=true;
            }
        }
        for(int n:input){
            if(count[hass[n]]==1){
                return n;
            }
        }
        return -1;
    }
}