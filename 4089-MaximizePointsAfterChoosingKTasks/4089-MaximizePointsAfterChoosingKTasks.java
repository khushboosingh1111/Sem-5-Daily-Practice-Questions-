// Last updated: 4/27/2026, 10:50:49 PM
class Solution {
    public long maxPoints(int[] t1, int[] t2, int k) {
        int l=t1.length;
        int[] profitGain=new int[l];
        long b=0;
        for(int i=0;i<l;i++){
            b=b+t2[i];
            profitGain[i]=t1[i]-t2[i];
        }
        // int x=0;
        long a=b;
        Arrays.sort(profitGain);
        for(int j=l-1;j>=l-k;j--){
            a+=profitGain[j];
        }
        for(int i=l-k-1;i>=0;i--){
            if(profitGain[i]>0){
                a+=profitGain[i];
            }
            else{
                break;
            }
        }
        return a;
    }
}