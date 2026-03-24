// Last updated: 3/24/2026, 12:26:14 PM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten =0;
        int twenty =0;
        int i =0;
        int n =bills.length;
        while(i<n){
            if(bills[i]==5){
                five++;
                i++;
            }
            else if(bills[i]==10){
                if(five==0 || five==-1){
                    return false;
                }
                else{
                    ten++;
                    five--;
                }
                i++;
            }
            else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if (five>=3){
                    five -= 3;
                }
                else{
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}