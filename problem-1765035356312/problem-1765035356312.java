// Last updated: 12/6/2025, 9:05:56 PM
1class Solution {
2    public long maxPoints(int[] t1, int[] t2, int k) {
3        int l=t1.length;
4        int[] profitGain=new int[l];
5        long b=0;
6        for(int i=0;i<l;i++){
7            b=b+t2[i];
8            profitGain[i]=t1[i]-t2[i];
9        }
10        // int x=0;
11        long a=b;
12        Arrays.sort(profitGain);
13        for(int j=l-1;j>=l-k;j--){
14            a+=profitGain[j];
15        }
16        for(int i=l-k-1;i>=0;i--){
17            if(profitGain[i]>0){
18                a+=profitGain[i];
19            }
20            else{
21                break;
22            }
23        }
24        return a;
25    }
26}