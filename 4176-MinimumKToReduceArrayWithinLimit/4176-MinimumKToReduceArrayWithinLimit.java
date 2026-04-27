// Last updated: 4/27/2026, 10:50:22 PM
class Solution {
    public int minimumK(int[] nums) {
        int left=1;
        int right=100000; 
        for(int i:nums){
            right=Math.max(right,i);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            long op=0;
            for(int i:nums){
                op+=(i+mid-1)/mid;
                if(op>(long)mid*mid){
                    break;
                }
            }
            if(op<=(long)mid*mid){
                
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
        
    }
}