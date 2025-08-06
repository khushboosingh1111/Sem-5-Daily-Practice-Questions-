// Last updated: 8/6/2025, 10:13:28 AM
class Solution {
    public String predictPartyVictory(String s) {
        Queue<Integer> d = new LinkedList<>();
        Queue<Integer> r = new LinkedList<>();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='D')d.add(i);
            else r.add(i);
        }
        int nxt = s.length();
        while(!r.isEmpty() && !d.isEmpty()){
            if(r.poll() < d.poll()){
                r.add(nxt++);
            }else{
                d.add(nxt++);
            }
        }
        if(!r.isEmpty()) return "Radiant";
        return "Dire";
    }
}