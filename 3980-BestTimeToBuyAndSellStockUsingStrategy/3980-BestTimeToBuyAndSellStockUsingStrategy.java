// Last updated: 4/27/2026, 10:51:16 PM
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        if(k>prices.length){
            return cBse(prices,strategy);
        }
        long bse=cBse(prices,strategy);
        long[]d1=new long[prices.length];
        long[] d2=new long[prices.length];
        for(int i=0;i<prices.length;i++){
            d1[i]=-(long)strategy[i]*prices[i];
            d2[i]=(1L-strategy[i])*prices[i];
        }
        long[] s1=new long[prices.length+1];
        long[] s2=new long[prices.length+1];
        for(int i=0;i<prices.length;i++){
            s1[i+1]=s1[i]+d1[i];
            s2[i+1]=s2[i]+d2[i];
        }
        int m=k/2;
        long anser=0;
        for(int st=0;st+k<=prices.length;st++){
            long g=(s1[st+m]-s1[st])+(s2[st+k]-s2[st+m]);
            if(g>anser){
                anser=g;
            }
        }
        return bse+anser;
    }
    private long cBse(int[]prices,int[] strategy){
        long s=0;
        for(int i=0;i<prices.length;i++){
            s=s+(long)prices[i]*strategy[i];
        }
        return s;
    }
}