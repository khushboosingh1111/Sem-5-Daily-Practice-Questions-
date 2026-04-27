// Last updated: 4/27/2026, 10:52:24 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor=0;
        for(int v:derived) {
        	xor^=v;
        }
        return xor==0;
    }
}