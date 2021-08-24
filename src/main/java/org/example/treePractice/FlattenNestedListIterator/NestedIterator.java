package org.example.treePractice.FlattenNestedListIterator;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author xuxinyao
 * @since 2021/8/24/23:07
 */


/**
 * todo 迭代版本
 */
public class NestedIterator implements Iterator<Integer> {
    Deque<NestedInteger> deque = new LinkedList<>();
    public NestedIterator(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            deque.addLast(nestedInteger);
        }
    }

    @Override
    public Integer next() {
        return deque.pollFirst().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (deque.size() > 0) {
            NestedInteger nestedInteger = deque.peekFirst();
            if (nestedInteger.isInteger()) {
                return true;
            }
            List<NestedInteger> nestedIntegerList = deque.pollFirst().getList();
            for (int i = nestedIntegerList.size() - 1; i >=0 ; i--) {
                deque.addFirst(nestedIntegerList.get(i));
            }
        }
        return false;
    }
}
