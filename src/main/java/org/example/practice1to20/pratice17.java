package org.example.practice1to20;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/2/9:03
 */
public class pratice17 {
    //17. 电话号码的字母组合
    //
    //给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
    //
    //给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        Map<Integer, String> map = new HashMap<Integer, String>(){{
            put(2,"abc");
            put(3,"def");
            put(4,"ghi");
            put(5,"jkl");
            put(6,"mno");
            put(7,"pqrs");
            put(8,"tuv");
            put(9,"wxyz");
        }};
        combine(digits,map,"",result);
        return result;
    }
    public void combine(String digits,Map<Integer,String> map, String element, List<String> result) {
        if (digits.length() == 0) {
            result.add(element);
            return;
        }
          Integer temp = Integer.valueOf( digits.substring(0,1));
          String str = map.get(temp);
        for (int i = 0; i < str.length() ; i++) {
            combine(digits.substring(1),map,element + str.charAt(i), result);
        }
    }
}
