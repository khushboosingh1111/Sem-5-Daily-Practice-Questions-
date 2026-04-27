// Last updated: 4/27/2026, 10:53:26 PM
class Solution {
    public int minPartitions(String n) {
        for(int i=9;i>0;i--)
        {
            if(n.contains(i+""))
            return i;
        }
        return 0;
    }
}