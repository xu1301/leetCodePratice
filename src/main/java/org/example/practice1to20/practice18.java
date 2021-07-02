package org.example.practice1to20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice18 {
    //18. 四数之和
    //给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
    //
    //注意：答案中不可以包含重复的四元组。
    //
    //
    //
    //示例 1：
    //
    //输入：nums = [1,0,-1,0,-2,2], target = 0
    //输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

    /**
     *  同 @practice15 三数之和解法  双指针求解
     *  时间复杂度：O(n3)
     *
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i >0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    int temp = nums[i] + nums[j] + nums[k] +nums[l];
                    if ( l < nums.length - 1 && nums[l] == nums[l + 1] || temp > target) {
                        l--;
                    } else if (k > j + 1 && nums[k] == nums[k - 1] || temp < target) {
                        k++;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        result.add(list);
                        k++;
                        l--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        fourSum(nums, 0);
    }
}
