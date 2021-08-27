package org.example;


import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
//        list.add(null);
//        list.add(null);
//        list.add(2);
        System.out.println(list);
        System.out.println(countWidth(list));
    }
    private static int countWidth(List<Integer> list) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && start == -1) {
                start = i;
            }
            if (list.get(i) != null && start != -1) {
                end = i;
            }
        }
        if (end == -1 && start != -1) {
            return 1;
        }
        if (start == -1) {
            return 0;
        }
        return end - start;
    }
}
