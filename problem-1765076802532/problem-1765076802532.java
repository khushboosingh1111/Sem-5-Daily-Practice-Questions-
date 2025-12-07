// Last updated: 12/7/2025, 8:36:42 AM
1class Solution {
2    public int[] sortByReflection(int[] nums) {
3        String[] a=new String[nums.length];
4        int j=0;
5        for(int x:nums){
6            a[j]=Integer.toBinaryString(x);
7            j++;
8        }
9        int[] b=new int[nums.length];
10        int k=0;
11        for(String x:a){
12            String rev=reverse(x);
13            b[k]=Integer.parseInt(rev,2);
14            k++;
15        }
16        int[][] arr=new int[nums.length][2];
17        for(int i=0;i<nums.length;i++){
18            arr[i][0]=nums[i];
19            arr[i][1]=b[i];
20        }
21        Arrays.sort(arr,(p,q)->{
22            if(p[1]==q[1]){
23                return p[0]-q[0];
24            }
25            return p[1]-q[1];
26        });
27        int[] ans=new int[nums.length];
28        for(int i=0;i<nums.length;i++){
29            ans[i]=arr[i][0];
30        }
31        
32        return ans;
33    }
34    private String reverse(String s){
35        return new StringBuilder(s).reverse().toString();
36    }
37}