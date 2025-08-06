// Last updated: 8/6/2025, 10:09:56 AM
class Solution {
    public int countSymmetricIntegers(int low, int high) {

        int total = 0;
        int number = low;

        while(number <= high){
            String str = Integer.toString(number);
            int first = 0;
            int mid = str.length()/2;
            int last = 0;
            if(str.length() % 2 == 0){
                for(int i = 0; i < mid; i++){
                    first +=  str.charAt(i) - '0';
                }
                for(int i = mid; i < str.length(); i++){
                    last += str.charAt(i) - '0';
                }
                if(first == last){
                    total++;
                }
            }
            first = 0;
            last = 0;
            number++;
        }
        return total;
    }
}