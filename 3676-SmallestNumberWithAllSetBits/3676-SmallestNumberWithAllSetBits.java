// Last updated: 8/6/2025, 10:09:28 AM
class Solution {
    public int smallestNumber(int n) {
        return AllSet(n);
        
    }
    public int AllSet(int n){
        int v = 2;
        int ans = 1;
        while(n>1){
            ans+=v;
            v*=2;
            n/=2;
        }
        return ans;
    }
}