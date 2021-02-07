class Solution {
    public int removeElement(int[] nums, int val) {
    //其他人的思路 比较不错
        int cnt=0;
		for(int num:nums)if(num!=val)nums[cnt++]=num;		
		return cnt;
    }
}
