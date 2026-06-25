class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0 ; i<nums.length;i++){
            int x = Math.abs(nums[i]) -1;
            if (nums[x] < 0){
                return x+1;
            }
            nums[x] *=-1;
        }
        return -1;
    }
}
