// Last updated: 4/27/2026, 10:52:00 PM
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int occ=1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==x){
            map.put(occ++,i);
        }
       }

       int [] ans= new int[queries.length];
       
       for( int i = 0; i < queries.length;i++){
        int q = queries[i];
        ans[i]=map.getOrDefault(q,-1);
       }
       return ans;
       
    }
}