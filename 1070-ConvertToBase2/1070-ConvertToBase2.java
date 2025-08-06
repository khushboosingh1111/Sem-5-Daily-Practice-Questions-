// Last updated: 8/6/2025, 10:11:50 AM
class Solution {
    public String baseNeg2(int n) {
        if(n==0) return "0";

        StringBuilder sb = new StringBuilder();

        while(n!=0){
            int rem = n%-2;
            n/=-2;

            if(rem <0){
                rem+=2;
                n++;
            }

            sb.append(rem);
        }

        return sb.reverse().toString();
    }
}