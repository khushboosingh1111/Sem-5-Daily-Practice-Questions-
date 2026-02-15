// Last updated: 2/16/2026, 12:12:59 AM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int i = a.length() - 1;
5        int j = b.length() - 1;
6        int carry = 0;
7
8        while (i >= 0 || j >= 0 || carry > 0) {
9            int sum = carry;
10            if (i >= 0) sum += a.charAt(i--) - '0';
11            if (j >= 0) sum += b.charAt(j--) - '0';
12
13            sb.append(sum % 2);
14            carry = sum / 2;
15        }
16
17        return sb.reverse().toString();
18    }
19}