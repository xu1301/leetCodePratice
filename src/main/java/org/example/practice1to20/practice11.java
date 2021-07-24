package org.example.practice1to20;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/24/10:43
 */
public class practice11 {
    //11. 盛最多水的容器
    //
    //给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
    //
    //说明：你不能倾斜容器。
    //
    //
    //
    //示例 1：
    //
    //输入：[1,8,6,2,5,4,8,3,7]
    //输出：49
    //解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。

    /**
     *  双指针遍历
     *  O(n )
    */
    public int maxArea(int[] height) {
        int maxArea  = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int minPos = left;
            if (height[minPos] > height[right]) {
                minPos = right;
            }
            int area = (right - left)* height[minPos];
            maxArea = maxArea > area ? maxArea : area;
            if (minPos == left) {
                left++;
            } else {
                right--;
            }

        }
        return maxArea;
    }

}
