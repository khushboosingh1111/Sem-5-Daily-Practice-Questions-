// Last updated: 8/6/2025, 10:15:06 AM
class Solution {
    public String getHint(String secret, String guess) {
        int [] s = new int[10];
        int [] g = new int[10];
        int a = 0,c=0;
        for(int i = 0 ;i<secret.length();i++){
            s[secret.charAt(i)-'0']++;
            g[guess.charAt(i)-'0']++;
            if(secret.charAt(i)==guess.charAt(i))a++;
        }
        for(int i = 0;i<10;i++){
            c+=Math.min(s[i],g[i]);
        }
        return a+"A"+(c-a)+"B";
    }
}