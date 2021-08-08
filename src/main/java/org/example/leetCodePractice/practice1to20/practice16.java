package org.example.leetCodePractice.practice1to20;

import java.util.Arrays;

public class practice16 {
    //给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
    //
    // 
    //
    //示例：
    //
    //输入：nums = [-1,2,1,-4], target = 1
    //输出：2
    //解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。

    /**
     *  经典双指针问题
     */
    public int threeSumClosest(int[] nums, int target) {
        int best = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int temp = nums[i] + nums[j] + nums[k];
                best = Math.abs(best - target) > Math.abs(temp - target) ? temp : best;
                if (temp > target) {
                    k--;
                }
                if (temp < target) {
                    j++;
                }
                if(temp == target ) {
                    break;
                }

            }
        }
        return best;
    }
}
