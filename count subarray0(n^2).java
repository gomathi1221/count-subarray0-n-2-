class Solution {
    public int countSubarrays(int arr[], int k) {
        int c=0;
        int sum=0;
     for(int i=0;i<arr.length;i++){
         sum=0;
         for(int j=i;j<arr.length;j++){
             sum+=arr[j];
             if(sum==k){
             c++;
         }
         }
        
     }
     return c;
      
    }
}