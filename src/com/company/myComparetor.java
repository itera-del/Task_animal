package com.company;

import java.util.Comparator;

/**
 * @author 刘芋池
 * @Description
 * @create 2020/11/4 20:22
 */
public class myComparetor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Animal ani1=(Animal) o1;
        Animal ani2=(Animal) o2;
        if(ani1==null||ani2==null){
            return 0;
        }
        if(ani1.age< ani2.age){
            return-1;
        }else if(ani1.age> ani2.age){
            return 1;
        }else{
            return 0;
        }
    }
}
