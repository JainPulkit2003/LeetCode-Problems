class Solution {
    public int[] searchRange(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=nums.length-1;j>=0;j--)
            {
                if(nums[i]==target && nums[j]==target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}