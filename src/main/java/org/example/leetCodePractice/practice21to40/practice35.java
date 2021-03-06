package org.example.leetCodePractice.practice21to40;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/5/11:36
 */
public class practice35 {
    //35. 搜索插入位置
    //
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    //
    //你可以假设数组中无重复元素。
    //
    //示例 1:
    //
    //输入: [1,3,5,6], 5
    //输出: 2

    /**
     *  二分法
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right)/2;
            if (nums[mid] < target) {
                right = mid;
            } else if (nums[mid] > target){
                left = mid;
            } else {
                return mid;
            }
        }
        return 0;
    }
}
