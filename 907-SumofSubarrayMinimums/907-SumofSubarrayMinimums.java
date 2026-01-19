// Last updated: 1/19/2026, 10:31:53 PM
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        Stack<Integer> st=new Stack<>();
4        int n=arr.length;
5        int[] prevSmaller=new int[n];
6        int[] nextSmaller=new int[n];
7        Arrays.fill(prevSmaller,-1);
8        Arrays.fill(nextSmaller,n);
9        for(int i=0;i<n;i++){
10            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
11                nextSmaller[st.pop()]=i;
12            }
13            st.push(i);
14        }
15        for(int i=n-1;i>=0;i--){
16            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
17                prevSmaller[st.pop()]=i;
18            }
19            st.push(i);
20        }
21        long sum=0;
22        long mod = 1000000007;
23        for(int i=0;i<n;i++){
24            int left=i-prevSmaller[i];
25            int right=nextSmaller[i]-i;
26            sum = (sum + arr[i] * left % mod * right % mod) % mod;
27            
28        }
29        return (int)sum;
30        
31    }
32}