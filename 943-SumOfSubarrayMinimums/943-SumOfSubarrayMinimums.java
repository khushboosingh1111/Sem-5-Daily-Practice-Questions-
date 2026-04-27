// Last updated: 4/27/2026, 10:55:02 PM
class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] prevsmaller =new int[n];
        int[] nextsmaller=new int[n];
        Arrays.fill(prevsmaller,-1);
        Arrays.fill(nextsmaller,n);
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                nextsmaller[st.pop()]=i;
            }
            st.push(i);
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                prevsmaller[st.pop()]=i;
            }
            st.push(i);
        }
        long sum=0;
        long mod=1000000007;
        for(int i=0;i<n;i++){
            int left=i-prevsmaller[i];
            int right=nextsmaller[i]-i;
            sum=(sum+left%mod*right%mod*arr[i])%mod;
        }
        return (int)sum;
    }
}