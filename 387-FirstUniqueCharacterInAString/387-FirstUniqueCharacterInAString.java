// Last updated: 8/6/2025, 10:14:44 AM
class Solution {
    public int firstUniqChar(String s) {
        int idx=-1;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[((int)s.charAt(i))-97]+=1;
        }
        for(int i=0;i<s.length();i++){
            if(arr[(int)s.charAt(i)-97]==1){
                return i;
            }
        }
        return -1;
    }
}