package com.njhr.service.impl;

import com.njhr.service.Person;

/**
 * @author ： Guo Zhaoning
 * @version : 1.0
 * @date ： 2020/8/27 22:55
 */
public class YellowPerson implements Person {
    @Override
    public void getPersonColor() {
        System.out.println("make a yellowPerson");
    }
}
