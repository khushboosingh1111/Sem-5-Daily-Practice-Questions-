// Last updated: 8/6/2025, 10:10:42 AM
class Solution {
    public int findTheWinner(int n, int k) {
        int index = findWinnerIndex(n, k);
        return index+1;
    }

    public int findWinnerIndex(int n, int k){
      
      if(n==1)
       return 0;
    

    return (findWinnerIndex(n-1, k) + k)% n;
 }
}