import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If map contains the complement, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Else put the current number with its index into the map
            map.put(nums[i], i);
        }

        return new int[] {}; // Default return (not found case, though per problem, one solution exists)
    }
}
