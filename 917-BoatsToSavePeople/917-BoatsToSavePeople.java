// Last updated: 8/6/2025, 10:12:30 AM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int count=people.length;
        
        
        while(left<right){
            int sum=people[left]+people[right];
            if (sum<=limit){
                count-=1;
                left++;
                right--;
            }
            else{
                right--;
            }
            

        }
    return count;
    }
}