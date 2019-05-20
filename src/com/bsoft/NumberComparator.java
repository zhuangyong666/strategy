package com.bsoft;

/**
 * @ClassName: NumberComparator
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-20 09:26
 **/
public class NumberComparator implements Comparator {
    @Override
    public int compareTo(Object arg1, Object arg2) {
        return (int) arg1 - (int) arg2;
    }
}
