package org.example.practice1to20;

import java.util.Arrays;
import java.util.List;

public class practice13 {


    //输入：
    //"MCMXCIV"
    //输出：
    //2216
    //预期结果：
    //1994
    //13. 罗马转数字
    public int romanToInt(String s) {
        int [] sys = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        List<String> roma = Arrays.asList("I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M");
        int result = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (s.length() - i >= 2) {
                String temp = s.substring(i,i + 2);
                if (roma.contains(temp)) {
                    result += sys[roma.indexOf(temp)];
                    i++;
                    continue;
                }
            }
            result += sys[roma.indexOf(String.valueOf(s.charAt(i)))];
        }
        return result;
    }
}
