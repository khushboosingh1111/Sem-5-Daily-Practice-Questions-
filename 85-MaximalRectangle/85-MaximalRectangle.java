// Last updated: 1/11/2026, 7:41:05 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        int[] arr=new int[matrix[0].length];
4        int ans=0;
5        for(int i=0;i<matrix.length;i++){
6            for(int j=0;j<matrix[0].length;j++){
7                if(matrix[i][j]=='0'){
8                    arr[j]=0;
9                }
10                else{
11                    arr[j]++;
12                }
13            }
14            ans=Math.max(ans,Largest_Histogram(arr));
15        }
16        return ans;
17    }
18    public static int Largest_Histogram(int[] heights){
19        Stack<Integer> st=new Stack<>();
20        int ans=0;
21        for(int i=0;i<heights.length;i++) {
22			while(!st.isEmpty() && heights[i]<heights[st.peek()]) {
23				int h=heights[st.pop()];
24                int r=i;
25                if(st.isEmpty()){
26                    ans=Math.max(h*r,ans);
27                }
28                else{
29                    int l=st.peek();
30                    int area=h*(r-l-1);
31                    ans=Math.max(area,ans);
32                }
33			}
34			st.push(i);
35		}
36        int r=heights.length;
37        while(!st.isEmpty()){
38            int h=heights[st.pop()];
39
40            if(st.isEmpty()){
41                ans=Math.max(h*r,ans);
42            }
43            else{
44                int l=st.peek();
45                int area=h*(r-l-1);
46                ans=Math.max(area,ans);
47            }
48        }
49        return ans;
50    }
51
52}