// Last updated: 4/1/2026, 10:23:33 PM
class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indices = new Integer[n];
        for(int i=0;i<n;i++) indices[i] =i; 

        Arrays.sort(indices , (a,b) -> positions[a] - positions[b]);

        Stack<Integer> st = new Stack<>();
        for(int idx : indices){
            
            if(directions.charAt(idx)=='R') st.push(idx);
            
            else{
                while(st.size()>0 && healths[idx]>0){
                    int rightRobot = st.peek();
                    if(healths[rightRobot]<healths[idx]){
                        st.pop();
                        healths[rightRobot] =0;
                        healths[idx]--;
                    }
                    else if(healths[rightRobot] == healths[idx]){
                        st.pop();
                        healths[rightRobot] =0;
                        healths[idx] = 0;
                        break;
                    }
                    else{
                         healths[rightRobot]--;
                        healths[idx] = 0;
                        break;
                    }
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(healths[i]>0) ans.add(healths[i]);
        }
        return ans;
    }
}