// Last updated: 8/6/2025, 10:09:23 AM
class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> freqw=new HashMap<>();
        for(List<String> resp:responses){
            Set<String> set=new HashSet<>();
            for(String res:resp){
                set.add(res);
            }
            for(String res:set){
                if(freqw.containsKey(res)){
                    freqw.put(res,freqw.get(res)+1);
                }
                else{
                    freqw.put(res,1);
                }
            }
        }
        String ans="";
        int max=0;
        for(String res:freqw.keySet()){
            int c=freqw.get(res);
            if(c>max || (c==max && res.compareTo(ans)<0)){
                ans=res;
                max=c;
            }
        }
        return ans;
    }
}