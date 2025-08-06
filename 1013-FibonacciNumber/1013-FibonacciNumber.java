// Last updated: 8/6/2025, 10:12:11 AM
class Solution {
    public int fib(int n){
        if(n<=1){
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

/*1)if(n<=1){
            return n;
        }
        int a=fib(n-1);
        int b=fib(n-2);
        return a+b;
        */
/*2)class Solution {
    Map<Integer,Integer> map= new HashMap<>();
    
    public int fib(int n) {
        
        if(n<=1){
            return n;
        }
        else if(map.containsKey(n)){
            return map.get(n);
        }
        int ans=fib(n-1)+fib(n-2);
        map.put(n,ans);
        return ans;
        
    }
}*/
/*3)class Solution {
    public int fibo(int n, Map<Integer,Integer> map) {
        
        if(n<=1){
            return n;
        }
        else if(map.containsKey(n)){
            return map.get(n);
        }
        int ans=fibo(n-1,map)+fibo(n-2,map);
        map.put(n,ans);
        return ans;
        
    }
    public int fib(int n){
        Map<Integer,Integer> map=new HashMap<>();
        return fibo(n,map);
    }
}*/
/*4)class Solution {
    public int fibo(int n,int[] map) {
        
        if(n<=1){
            return n;
        }
        else if(map[n]!=0){
            return map[n];
        }
        int ans=fibo(n-1,map)+fibo(n-2,map);
        map[n]=ans;
        return ans;
        
    }
    public int fib(int n){
        int[] map=new int[n+1];
        return fibo(n,map);
    }
}*/