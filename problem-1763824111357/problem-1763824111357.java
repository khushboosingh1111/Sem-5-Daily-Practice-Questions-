// Last updated: 11/22/2025, 8:38:31 PM
class Solution {
    public int totalWaviness(int num1, int num2) {
        int r=num1;
        int ans=0;
        for(int i=num1;i<=num2;i++){
            String s=Integer.toString(i);
            if(s.length()<3){
                continue;
            }
            int[] arr=new int[s.length()];
            for(int j=0;j<s.length();j++){
                arr[j]=s.charAt(j)-'0';
            }
            for(int k=1;k+1<arr.length;k++){
                int a=arr[k-1];
                int b=arr[k];
                int c=arr[k+1];
                if((a<b && b>c) || (a>b && b<c)){
                    ans++;
                }
            }
        }
        return ans;
    }
}