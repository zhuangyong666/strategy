package com.bsoft;

import java.util.LinkedList;

/**
 * @ClassName: MyList
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-20 09:31
 **/
public class MyList<T> extends LinkedList<T> {
    public void sort(Comparator comparator) {
        T arg0 = this.get(0);
        T arg1 = this.get(1);
        int result = comparator.compareTo(arg0, arg1);
        if (result > 0) {
            this.clear();
            this.add(0, arg1);
            this.add(1, arg0);
        }
    }
}
