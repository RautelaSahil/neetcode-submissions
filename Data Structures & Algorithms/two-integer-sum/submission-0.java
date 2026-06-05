class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i<nums.length; i++ ){
            int n = nums[i];
            int diff = target - n;
            if(hm.containsKey(diff)){
                return new int[] {hm.get(diff),i};
            }
            hm.put(n,i);
        }
        return new int[] {};
    }
}
