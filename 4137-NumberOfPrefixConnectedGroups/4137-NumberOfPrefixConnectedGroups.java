// Last updated: 4/27/2026, 10:50:33 PM
class Solution {
    public int prefixConnected(String[] words, int k) {
        String[] st=words;
        HashMap<String,Integer> map=new HashMap<>();
        int grp=0;
        for(String str:st){
            if(str.length()<k){
                continue;
            }
            String pre=str.substring(0,k);
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        for(int cnt:map.values()){
            if(cnt>=2){
                grp++;
            }
        }
        return grp;
    }
}