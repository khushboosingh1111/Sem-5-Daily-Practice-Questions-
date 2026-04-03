// Last updated: 4/3/2026, 10:51:15 PM
1class Solution {
2    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
3        int n = positions.length;
4        Integer[] indices = new Integer[n];
5        for(int i=0;i<n;i++) indices[i] =i; 
6
7        Arrays.sort(indices , (a,b) -> positions[a] - positions[b]);
8
9        Stack<Integer> st = new Stack<>();
10        for(int idx : indices){
11            
12            if(directions.charAt(idx)=='R') st.push(idx);
13            
14            else{
15                while(st.size()>0 && healths[idx]>0){
16                    int rightRobot = st.peek();
17                    if(healths[rightRobot]<healths[idx]){
18                        st.pop();
19                        healths[rightRobot] =0;
20                        healths[idx]--;
21                    }
22                    else if(healths[rightRobot] == healths[idx]){
23                        st.pop();
24                        healths[rightRobot] =0;
25                        healths[idx] = 0;
26                        break;
27                    }
28                    else{
29                         healths[rightRobot]--;
30                        healths[idx] = 0;
31                        break;
32                    }
33                }
34            }
35        }
36        List<Integer> ans = new ArrayList<>();
37        for(int i =0;i<n;i++){
38            if(healths[i]>0) ans.add(healths[i]);
39        }
40        return ans;
41    }
42}