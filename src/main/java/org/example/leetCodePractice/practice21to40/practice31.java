package org.example.leetCodePractice.practice21to40;

import java.util.Arrays;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/5/10:00
 */
public class practice31 {
    //31. 下一个排列
    //
    //实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
    //
    //如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
    //
    //必须 原地 修改，只允许使用额外常数空间。
    //示例 1：
    //输入：nums = [1,2,3]
    //输出：[1,3,2]

    /**
     * todo 字典序排序，加深理解
     * @注意 ： 字典序的下一个排列，注意字典序的定义
     * @思路：
     *  1. 双指针
     *  2. fast从后往前遍历，记录遇到的最大的值
     *  3. 当发现后面有比当前值大的值时，slow指针开始从后往前遍历至fast，找到比当前值大的最小值，互换
     *  4.@Warning 互换后要对较大值之后的序列进行升序排序，以保证是下一个排列
     */
    public void nextPermutation(int[] nums) {
        int maxPos = nums.length - 1;
        boolean flag = false;
        for (int i = nums.length - 2; i >=0; i--) {
            if (nums[i] >= nums[maxPos]) {
                maxPos = i;
            } else {
                int  minBiggerPos = maxPos;
                //slow开始移动
                for (int j = nums.length - 1; j > i ; j--) {
                    if (nums[j] > nums[i] && nums[j] <= nums[minBiggerPos]) {
                        minBiggerPos = j;
                        flag = true;
                    }
                }
                if (flag) {
                    int temp = nums[i];
                    nums[i] = nums[minBiggerPos];
                    nums[minBiggerPos] = temp;
                }
                break;
            }
        }
        if (!flag) {
            Arrays.sort(nums);
        }
    }
}
