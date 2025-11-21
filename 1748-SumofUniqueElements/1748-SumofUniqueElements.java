// Last updated: 11/21/2025, 2:50:27 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int f=map.get(s.charAt(0));
        for(char ch:s.toCharArray()){
            if(f!=(int)map.get(ch)){
                return false; 
            }

        }
        return true;
        
    }
}