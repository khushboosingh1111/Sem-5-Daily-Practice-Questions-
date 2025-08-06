// Last updated: 8/6/2025, 10:13:06 AM
class Solution {
    public int monotoneIncreasingDigits(int n) {
        return monotone(n);
    }
    public static int monotone(int n){
        String s = n+"";
        char[] arr = s.toCharArray();
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                arr[i] =(char)(arr[i]-1);
                for(int j=i+1;j<arr.length;j++){
                    arr[j]='9';
                }
            }
        }
        return Integer.parseInt(new String(arr));
    }

}