package org.example.pratice1to20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pratice15 {
    //15. 三数之和
    //给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
    //
    //注意：答案中不可以包含重复的三元组。
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>();
            if (i >0 && nums[i] == nums[i-1]) {
                continue;
            }
            int a = nums[i];
            int j = i + 1 ;
            int k = 0;
            while (j + k < nums.length - 1) {
                int b = nums[j];
                int c = nums[nums.length -1 - k];

                if (a + b + c < 0 || nums[j] == nums[j-1]) {
                    j++;
                    continue;
                }
                if (a + b +c > 0 || k > 0 && c == nums[nums.length - k]) {
                    k++;
                    continue;
                }

                if (a + b + c == 0){
                    temp.add(a);
                    temp.add(b);
                    temp.add(c);
                    result.add(temp);
                    break;
                }
            }
        }
        return result;
    }
}
