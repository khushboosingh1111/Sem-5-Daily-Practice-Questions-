// Last updated: 4/27/2026, 10:50:48 PM
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