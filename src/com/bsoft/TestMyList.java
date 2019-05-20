package com.bsoft;

import java.util.List;

/**
 * @ClassName: TestMyList
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-20 09:40
 **/
public class TestMyList {
    public static void main(String[] args) {
        List myList = new MyList();
        myList.add(2);
        myList.add(1);
        traversingList(myList);
        System.out.println("------分隔符--------");
        ((MyList) myList).sort(new ObjectComparator());
        traversingList(myList);
    }

    private static void traversingList(List list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
