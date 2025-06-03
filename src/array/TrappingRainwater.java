package array;

/*
Given n non-negative integers representing an elevation(height) map where the width of each bar is 1,
compute how much water it can trap after raining
*/

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        int width = 1;

        int trappedWater = trappingRainWater(height,width);
        System.out.println("THE TRAPPED WATER IS: " + trappedWater);
    }

    public static int trappingRainWater(int[] height , int width) {
        int n = height.length;

        int[] left_max = new int[n];
        left_max[0] = height[0];
        // Calculate Left max Boundary - array
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(left_max[i - 1], height[i]);
        }

        // Calculate Right max Boundary - array
        int[] right_max = new int[n];
        right_max[n - 1] = height[n - 1];
        for (int i = (n - 2); i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], height[i]);
        }

        // Calculate Total Trapped Rainwater
        int trapped_rainwater = 0 ;
        for (int i = 0; i < n; i++) {
            int water_level = Math.min(left_max[i],right_max[i]);
            trapped_rainwater += ((water_level - height[i]) * width);
        }

        return trapped_rainwater;
    }
}
