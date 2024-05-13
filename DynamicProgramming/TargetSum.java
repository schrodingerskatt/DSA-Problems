// Problem Link : https://leetcode.com/problems/target-sum/

class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {

        Map<String, Integer> dp = new HashMap<>();
        return findWays(nums, 0, 0, target, dp);
    }

    private int findWays(int[] nums, int index, int total, int target, Map<String, Integer> dp) {
        if (index == nums.length) {
            if (total == target) {
                return 1;
            } else {
                return 0;
            }
        }

        String key = index + "," + total;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        int ways = findWays(nums, index + 1, total + nums[index], target, dp)
                + findWays(nums, index + 1, total - nums[index], target, dp);
        dp.put(key, ways);
        return ways;
        
    }
}