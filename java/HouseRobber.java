// Salesforce

public class HouseRobberII {

	    public int rob(int[] nums) {
	        if (nums.length == 0) return 0;
	        if (nums.length == 1) return nums[0];
	        if (nums.length == 2) return Math.max(nums[0], nums[1]);

	        return Math.max(calc(nums, 0, nums.length - 2), calc(nums, 1, nums.length - 1));
	    }

	    private int calc(int[] nums, int left, int right) {
	        int[] dp = new int[nums.length];

	        dp[left] = nums[left];
	        dp[left + 1] = Math.max(nums[left], nums[left + 1]);
	        for (int i = left + 2; i <= right; i++) {
	            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
	        }
	        return dp[right];

	    }

	    public static void main(String args[]) {
	    	int[] nums = {1,2,3,1,4,5};
	    	HouseRobberII rob =  new HouseRobberII();
	    	System.out.println(rob.rob(nums));
	    }
}
