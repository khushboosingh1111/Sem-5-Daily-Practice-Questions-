// Last updated: 4/27/2026, 10:50:54 PM
class Solution {
    public int[] lexSmallestNegatedPerm(int n, long target) {
        long m=(long)n*(n+1)/2;
        boolean f=true;
        long d=m-target;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        if(target>m || target<-m){
            return new int[0];
        }
        if(d%2!=0){
            return new int[0];
        }
        d=d/2;
        for(int i=arr.length-1;i>=0;i--){
            if(d==0){
                break;
            }
            if(arr[i]<=d){
                d-=arr[i];
                arr[i]=-1*arr[i];
            }
        }
        Arrays.sort(arr);
        return arr;
        
    }
}