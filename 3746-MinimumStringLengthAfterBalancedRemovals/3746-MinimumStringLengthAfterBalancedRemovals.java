// Last updated: 11/17/2025, 6:34:06 PM
class Solution {
    public int minLengthAfterRemovals(String s) {
        int ca=0;
        int cb=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'){
                ca++;
            }
            else if(ch=='b'){
                cb++;
            }
        }
        return Math.abs(ca-cb);
    }
}