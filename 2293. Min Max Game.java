class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1) return nums[0];
        int ans[]=new int[nums.length/2];

        for(int i=0;i<ans.length;i++){
            ans[i]= i%2==0 ? Math.min(nums[2 * i], nums[2 * i + 1]) :
             Math.max(nums[2 * i], nums[2 * i + 1]); 
        }
        return minMaxGame(ans);
    }
}
