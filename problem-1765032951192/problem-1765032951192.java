// Last updated: 12/6/2025, 8:25:51 PM
1class Solution {
2    public int[] minOperations(int[] nums) {
3        int n=nums.length;
4        int[] ans=new int[n];
5        for(int i=0;i<n;i++){
6           int x=nums[i];
7            int ds=0;
8            int d=x;
9            while(d>=1 && !isPalindromic(d)){
10                d--;
11                ds++;
12            }
13            int us=0;
14            int u=x;
15            while(!isPalindromic(u)){
16                u++;
17                us++;
18            }
19            ans[i]=Math.min(ds,us);
20           
21        }
22        return ans;
23    }
24    private boolean isPalindromic(int x){
25        String b=Integer.toBinaryString(x);
26        int si=b.length();
27        int s=0;
28        int e=si-1;
29        
30        while(s<e){
31            if(b.charAt(s)!=b.charAt(e)){
32                return false;
33            }
34            s++;
35            e--;
36        }
37        return true;
38    }
39}