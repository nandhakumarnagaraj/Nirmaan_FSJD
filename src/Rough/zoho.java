package Rough;

import java.util.HashMap;

class Solution {
    public int zoho(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int ans = 0;

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int count : frequencyMap.values()) {
            if (count > 1) {
                // Calculate pairs: count * (count - 1) / 2
                ans += count * (count - 1) / 2;
            }
        }

        return ans;
    }
    //4
}
