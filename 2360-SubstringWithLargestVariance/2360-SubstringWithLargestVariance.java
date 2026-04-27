// Last updated: 4/27/2026, 10:52:45 PM
class Solution {
    public int largestVariance(String s) {
        int occur[] = new int [26];
        char ch[] = s.toCharArray();

        for(char c : ch){
            occur[c - 'a'] = 1;
        }

        int maxVariance = 0;

        for(int i = 0; i<26; i++){
            for(int j = 0; j<26; j++){
                if(i == j){
                    continue;
                }

                //now we chack this two char are present in the string or not
                if(occur[i] == 1 && occur[j] == 1){
                    int f1 = 0;
                    int f2 = 0;
                    boolean isPrevOccr = false;
                    for(char c : ch){
                        if(i == (c - 'a')){
                            f1++;
                        }
                        if(j == (c - 'a')){
                            f2++;
                        }

                        if(f1 > 0 && f2 > 0){
                            maxVariance = Math.max(maxVariance, f1 - f2);
                        }
                        else if (f1 > 0 && f2 == 0 && isPrevOccr){
                            maxVariance = Math.max(maxVariance, f1 - 1);
                        }

                        if(f2 > f1){
                            f1 = 0;
                            f2 = 0;
                            isPrevOccr = true;
                        }
                    }
                }
            }
        }
        return maxVariance ;
    }
}