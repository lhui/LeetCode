class Solution {
    public int removeDuplicates(int[] nums) {
        int len=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    len++;
                    // 将i到j的所有数据变为j的数据
                    for(int k=i+1;k<j;k++){
                        nums[k]=nums[j];
                    }
                    break;
                }
            }
        }
        return len;
    }
}
