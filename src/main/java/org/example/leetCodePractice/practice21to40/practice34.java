package org.example.leetCodePractice.practice21to40;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/28/9:20
 */
public class practice34 {
    //34. 在排序数组中查找元素的第一个和最后一个位置
    //
    //给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
    //
    //如果数组中不存在目标值 target，返回 [-1, -1]。
    //
    //进阶：
    //
    //    你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
    //
    //
    //
    //示例 1：
    //
    //输入：nums = [5,7,7,8,8,10], target = 8
    //输出：[3,4]

    /**
     * 二分法
     */
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        boolean flag = false;
        while (left < right) {
            int mid = (left + right)/2;
            if (nums[mid] == target) {
                flag = true;
                break;
            }
            if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if(flag) {

        }
        return nums;
    }
}
