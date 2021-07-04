package org.example.practice21to40;

import java.util.Arrays;

public class practice26 {
    //给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
    //
    //不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
    //
    // 
    //
    //说明:
    //
    //为什么返回数值是整数，但输出的答案是数组呢?
    //
    //请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
    //
    //你可以想象内部操作如下:
    //
    //// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
    //int len = removeDuplicates(nums);
    //
    //// 在函数里修改输入数组对于调用者是可见的。
    //// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
    //for (int i = 0; i < len; i++) {
    //    print(nums[i]);
    //}
    // 
    //示例 1：
    //
    //输入：nums = [1,1,2]
    //输出：2, nums = [1,2]
    //解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。

    /**
     *  遍历，若相邻相等，则整体向前移动一位
     *  时间复杂度: nlog(n)
     */
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - count; i++) {
            if (nums[i] == nums[i - 1]) {
                //若相等，整体向前移动一位
                for (int j = i ; j < nums.length - count; j++) {
                    if (j != nums.length - count - 1) {
                        nums[j] = nums[j + 1];
                    }
                }
                count++;
                i--;
            }
        }
        return nums.length - count;
    }

    /**
     * todo 快慢指针
     * 时间复杂度 O(n)
     *
     */
    public int removeDuplicates2(int[] nums) {
        return 0;
    }
}
