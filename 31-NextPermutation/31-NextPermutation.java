// Last updated: 3/10/2026, 9:12:31 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        nextpermutation(nums);
4        
5    }
6    public static void nextpermutation(int[] arr){
7        int p=-1;
8        int n=arr.length;
9        for(int i=n-2;i>=0;i--){
10            if(arr[i]<arr[i+1]){
11                p=i;
12                break;
13            }
14        }
15        if(p==-1){
16            reverse(arr,0,n-1);
17            return;
18        }
19        int q=-1;
20        for(int i=n-1;i>p;i--){
21            if(arr[i]>arr[p]){
22                q=i;
23                break;
24
25            }
26        }
27        //swap p&q
28        int temp=arr[p];
29        arr[p]=arr[q];
30        arr[q]=temp;
31        reverse(arr,p+1,n-1);
32        return;
33
34    }
35    public static void reverse(int[] arr,int i,int j){
36        while(i<j){
37            int temp=arr[i];
38            arr[i]=arr[j];
39            arr[j]=temp;
40            i++;
41            j--;
42        }
43    }
44}