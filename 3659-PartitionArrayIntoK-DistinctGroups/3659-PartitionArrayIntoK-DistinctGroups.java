// Last updated: 8/24/2025, 11:14:48 PM
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        HashMap<Integer,Integer> c=new HashMap<>();
        int[] an=nums;
        if(an.length%k!=0){
            return false;
        }
        int possi=an.length/k;
        for(int i=0;i<an.length;i++){
            int v=an[i];
            c.merge(v,1,Integer::sum);
            if(isInvalid(c,v,an.length,k)){
                return false;
            }
            
        }
        return an.length%k==0;
    }
    private boolean isInvalid( HashMap<Integer,Integer> map,int key,int total,int size){
        int grups=total/size;
        return map.get(key)>grups;
    }
}