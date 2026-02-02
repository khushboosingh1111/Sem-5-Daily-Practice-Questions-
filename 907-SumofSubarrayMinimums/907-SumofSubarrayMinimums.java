// Last updated: 2/2/2026, 11:46:55 AM
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        Stack<Integer> st=new Stack<>();
4        int n=arr.length;
5        int[] prevsmaller =new int[n];
6        int[] nextsmaller=new int[n];
7        Arrays.fill(prevsmaller,-1);
8        Arrays.fill(nextsmaller,n);
9        for(int i=0;i<n;i++){
10            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
11                nextsmaller[st.pop()]=i;
12            }
13            st.push(i);
14        }
15        for(int i=n-1;i>=0;i--){
16            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
17                prevsmaller[st.pop()]=i;
18            }
19            st.push(i);
20        }
21        long sum=0;
22        long mod=1000000007;
23        for(int i=0;i<n;i++){
24            int left=i-prevsmaller[i];
25            int right=nextsmaller[i]-i;
26            sum=(sum+left%mod*right%mod*arr[i])%mod;
27        }
28        return (int)sum;
29    }
30}