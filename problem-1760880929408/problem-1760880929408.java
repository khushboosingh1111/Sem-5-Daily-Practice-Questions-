// Last updated: 10/19/2025, 7:05:29 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int st=1;
        int end=num/2;
        if(num==1){
            return true;
        }
        while(st<=end){
            long mid=st+(end-st)/2;
            long sq=mid*mid;
            if(sq==num){
                return true;
            }
            else if(sq>num){
                end=(int)mid-1;
            }
            else{
                st=(int)mid+1;
            }
        }
        return false;
    }
}