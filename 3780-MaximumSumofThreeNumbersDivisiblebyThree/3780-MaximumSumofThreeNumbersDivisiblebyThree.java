// Last updated: 12/23/2025, 3:54:44 PM
1class Solution {
2    public int maximumSum(int[] nums) {
3        int[] arr=nums;
4        int ans=0;
5        List<Integer> r0=new ArrayList<>();
6        List<Integer> r1=new ArrayList<>();
7        List<Integer> r2=new ArrayList<>();
8        for(int i:arr){
9            if(i%3==0){
10                r0.add(i);
11            }
12            else if(i%3==1){
13                r1.add(i);
14            }
15            else{
16                r2.add(i);
17            }
18        }
19        r0.sort(Collections.reverseOrder());
20        r1.sort(Collections.reverseOrder());
21        r2.sort(Collections.reverseOrder());
22        if(r0.size()>=3){
23            ans=Math.max(ans,r0.get(0)+r0.get(1)+r0.get(2));
24        }
25        if(r1.size()>=3){
26            ans=Math.max(ans,r1.get(0)+r1.get(1)+r1.get(2));
27        }
28        if(r2.size()>=3){
29            ans=Math.max(ans,r2.get(0)+r2.get(1)+r2.get(2));
30            
31        }
32        if(r0.size()>=1 && r1.size()>=1 && r2.size()>=1){
33            ans=Math.max(ans,r0.get(0)+r1.get(0)+r2.get(0));
34            
35        }
36        return ans;
37        
38    }
39}