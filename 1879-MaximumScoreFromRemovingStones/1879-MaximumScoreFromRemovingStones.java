// Last updated: 8/6/2025, 10:10:48 AM
class Solution {

    public int maximumScore(int a, int b, int c) {

        if (b > a) {

            int temp = a;

            a = b;

            b = temp;

        }

        if (c > a) {

            int temp = a;

            a = c;

            c = temp;

        }

        if (b < c) {

           int temp = b;

            b = c;

            c = temp;

        }

        return Math.min(a + b + c - Math.max(a, Math.max(b, c)), (a + b + c) / 2);

    }

}