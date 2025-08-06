// Last updated: 8/6/2025, 10:14:02 AM
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        return house(houses,heaters);
    }
    public static int house(int[] arr, int[] heater){
        Arrays.sort(arr);
        Arrays.sort(heater);
        int ans = Integer.MAX_VALUE;
        int lo = 0;
        int hi = Math.max(arr[arr.length-1],heater[heater.length-1])-Math.min(arr[0],heater[0]);
        ans = hi;
        while(lo<=hi){
            int mid = lo+((hi-lo)/2);
            if(ispossible(arr,heater,mid)){
                hi=mid-1;
                ans = Math.min(ans,mid);
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    public static boolean ispossible(int[] arr, int[] heater,int mid){
        int idx = 0;
        //heater(position) m esa kya dist +ya - kre jisse uss range m sare houses cover ho jaye
        for(int i=0;i<arr.length;i++){

            if(arr[i]<heater[idx]-mid )return false;  //The current heater can't cover/reach this house (too far).But maybe the next heater can.(left boundry se bhar)
            else if(arr[i]>heater[idx]+mid){ //(right boundry se bhar)
                idx++;
                i--;
            }
            if(idx==heater.length)return false; //(sare houses check kr liye fir vhi koi houses bacha h heater khtm hone pr)
        }
        return true;
    }
}
