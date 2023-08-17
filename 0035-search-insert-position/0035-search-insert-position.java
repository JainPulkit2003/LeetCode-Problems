class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        boolean flag = false;
        int ans = 0;
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target)
            {
                flag = true;
                ans = mid;
                break;
            }
            else if(target>nums[mid])
            {
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        if(flag){
            return ans;
        }
        else
        {
            return s;
        }
    }
}