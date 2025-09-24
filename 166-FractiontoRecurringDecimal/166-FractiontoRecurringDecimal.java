// Last updated: 9/24/2025, 7:48:24 PM
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
        if(numerator==0){
            return "0";
        }

        StringBuilder res=new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) res.append("-");
        long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);

        res.append(num/den);
        long rem=num%den;
        if(rem==0){
            return res.toString();
        }

        res.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (rem != 0) {
            if (map.containsKey(rem)) {
                int idx = map.get(rem);
                res.insert(idx, "(");
                res.append(")");
                return res.toString();
            }
            map.put(rem, res.length());
            rem *= 10;
            res.append(rem/ den);
            rem %= den;
        }
        return res.toString();
        
    }
}