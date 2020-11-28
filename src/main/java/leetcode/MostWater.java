package leetcode;

// https://leetcode.com/problems/container-with-most-water/
public class MostWater {
    public static int maxArea(int[] height) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++)
            for (int j = i+1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int w = Math.abs(j-i);
                if (h*w > result)
                    result = h*w;
            }
        return result;
    }

    public static void main(String[] args) {
        int [] height1 = {1, 1};
        System.out.println(maxArea(height1));
        int [] height2 = {4, 3, 2, 1, 4};
        System.out.println(maxArea(height2));
        int [] height3 = {1, 2, 1};
        System.out.println(maxArea(height3));
    }
}
