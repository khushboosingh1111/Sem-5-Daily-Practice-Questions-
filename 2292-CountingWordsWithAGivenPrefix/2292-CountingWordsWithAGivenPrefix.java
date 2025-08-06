// Last updated: 8/6/2025, 10:10:11 AM
class Solution {
    public int prefixCount(String[] words, String pref) {
        return CountPrefix(words, pref);
    }
    public int CountPrefix(String[] arr, String pre){
        int count = 0;
        int pre_len=pre.length();
        for(int i=0;i<arr.length; i++){
            if(arr[i].length()>= pre_len && arr[i].substring(0,pre_len).equals(pre)){
                count++;
            }
            
        }
        return count;
    }
}