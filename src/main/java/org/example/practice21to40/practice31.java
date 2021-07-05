package org.example.practice21to40;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/5/10:00
 */
public class practice31 {
    //33. 搜索旋转排序数组
    //
    //整数数组 nums 按升序排列，数组中的值 互不相同 。
    //
    //在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
    //
    //给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
    //
    //
    //
    //示例 1：
    //
    //输入：nums = [4,5,6,7,0,1,2], target = 0
    //输出：4

    /**
     * [left, r, right]
     *  取mid = (left + right)/2
     *  若nums[mid] > nums[0]，r在mid左边
     *  若nums[mid] < nums[0]，r在mid右边
     *  若target > nums[length - 1] ， 说明在[0 , r]
     *  若target < nums[length - 1] ， 说明在[r, length - 1]
     *  二分法
     *  时间复杂度：O(log n)
     */
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start < end){
            int mid = (start + end) / 2;
            if (nums[mid] > nums[start]) {

            }
        }
        return -1;
    }
}
