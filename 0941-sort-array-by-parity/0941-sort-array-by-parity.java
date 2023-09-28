class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // if(nums.length==1)
        // {
        //     return nums[0];
        // }
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                count++;
            }
        }
        int arr[] = new int[nums.length];
        int odd = count;
        int even = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                arr[even++] = nums[i];
            }
            if(nums[i]%2!=0)
            {
                arr[odd++] = nums[i];
            }
        }
        return arr;
    }
}