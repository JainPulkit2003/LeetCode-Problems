class Solution {
    public int search(int[] nums, int target) {
        // int n = nums.length;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target)
        //     {
        //         return i;
        //     }
        // }
        // return -1;

        int n = nums.length;
        int s = 0;
        int e = n - 1;
        while(s <= e){
            int mid = s + (e-s) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                s = mid+1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }
}
// 0 + 5/2 = 2 // index
// nums[mid] = 3; // element
// 9 > 3 // yes
// 2 + 1 = 3 // new start index 

// 3 + (5 - 3)/2 = 3 + 1=4// index
// 9// element
// 9 == 9