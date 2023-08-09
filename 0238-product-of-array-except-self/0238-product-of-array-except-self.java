// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] res = new int[nums.length];
//         for(int i=0;i<nums.length;i++)
//         {
//             int multi =1;
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 multi = multi*nums[j];
//             }
//             for(int k=i-1;k>=0;k--)
//             {
//                 multi = multi*nums[k];
//             }
//             res[i] = multi;
//         }
//         return res;
//     }
// }


// OPTIMAL:
class Solution {
    public int[] productExceptSelf(int[] nums) {
      int result [] = new int [nums.length];
        int multi = 1;
        //left Pass
        for(int i = 0; i < nums.length; i++){
            result[i] = multi; //for every index we will put multi
            multi = multi * nums[i]; //update the multi
        }
        //rightPass
        //for rightPass Again update multi as 1
        multi = 1;
        for(int i = nums.length -1 ; i >= 0; i--){
            //multiply the value present on ith index with rightPass Value
            result[i] = result[i] * multi;
            multi = multi * nums[i];//update the multi
        }
        return result;  
    }
}