package com.njhr.service.impl;

import com.njhr.service.Country;

/**
 * @author ： Guo Zhaoning
 * @version : 1.0
 * @date ： 2020/8/27 23:17
 */
public class China implements Country {
    @Override
    public void getCountry() {
        System.out.println("china");
    }
}
