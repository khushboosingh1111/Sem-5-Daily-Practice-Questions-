// Last updated: 4/27/2026, 10:53:53 PM
class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int teams=0;
        for(int i=1;i<n-1;i++){
            int countLeftSmaller=0;
            int countLeftLarger=0;
            int countRightSmaller=0;
            int countRightLarger=0;
            for(int j=0;j<i;j++){
                if(rating[i]>rating[j]){
                    countLeftLarger++;
                }
                else if(rating[i]<rating[j]){
                    countLeftSmaller++;
                }
            }
            for(int k=i+1;k<n;k++){
                if(rating[i]>rating[k]){
                    countRightLarger++;
                }
                else if(rating[i]<rating[k]){
                    countRightSmaller++;
                }
            }
            teams+=(countLeftSmaller*countRightLarger)+(countLeftLarger*countRightSmaller);
        }
        return teams;
    }
}