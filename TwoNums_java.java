class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] re={0,0};
         for(int i=0;i<nums.length;i++)
         {
             for(int j=i+1;j<nums.length;j++)
             {
                 if(nums[i]+nums[j]==target)
                 {
                     re[0]=i;
                     re[1]=j;
                     return re;
                 }
             }
         }
         return re;
    }
}
