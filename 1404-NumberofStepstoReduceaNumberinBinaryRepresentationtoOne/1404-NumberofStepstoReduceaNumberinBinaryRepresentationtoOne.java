// Last updated: 2/26/2026, 12:09:16 PM
1import java.math.BigInteger;
2class Solution {
3    public int numSteps(String s) {
4        BigInteger num = new BigInteger(s, 2);
5        int c = 0;
6        BigInteger one = BigInteger.ONE;
7        BigInteger two = new BigInteger("2");
8        
9        while(!num.equals(one)){
10            if(num.mod(two).equals(BigInteger.ZERO)){
11                num = num.divide(two);
12            } else {
13                num = num.add(one);
14            }
15            c++;
16        }
17        return c;
18    }
19}