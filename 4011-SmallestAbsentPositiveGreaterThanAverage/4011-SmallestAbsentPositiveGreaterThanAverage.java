// Last updated: 4/27/2026, 10:51:04 PM
class Solution {
    public int smallestAbsent(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        double avg=(double)sum/nums.length;
        int ans=(int)Math.floor(avg)+1;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(i>0){
                set.add(i);
            }
        }
        
        
        if(ans<=0 ){
            ans=1;
        }
        while(set.contains(ans)){
            ans++;
        }
        return ans;
    }
}