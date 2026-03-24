// Last updated: 3/24/2026, 12:25:53 PM
1class Solution {
2
3    public boolean lemonadeChange(int[] bills) {
4        // Count of $5 and $10 bills in hand
5        int fiveDollarBills = 0;
6        int tenDollarBills = 0;
7
8        // Iterate through each customer's bill
9        for (int customerBill : bills) {
10            if (customerBill == 5) {
11                // Just add it to our count
12                fiveDollarBills++;
13            } else if (customerBill == 10) {
14                // We need to give $5 change
15                if (fiveDollarBills > 0) {
16                    fiveDollarBills--;
17                    tenDollarBills++;
18                } else {
19                    // Can't provide change, return false
20                    return false;
21                }
22            } else { // customerBill == 20
23                // We need to give $15 change
24                if (tenDollarBills > 0 && fiveDollarBills > 0) {
25                    // Give change as one $10 and one $5
26                    fiveDollarBills--;
27                    tenDollarBills--;
28                } else if (fiveDollarBills >= 3) {
29                    // Give change as three $5
30                    fiveDollarBills -= 3;
31                } else {
32                    // Can't provide change, return false
33                    return false;
34                }
35            }
36        }
37        // If we've made it through all customers, return true
38        return true;
39    }
40}