package com.njhr;

import com.njhr.service.Person;

/**
 * @author ： Guo Zhaoning
 * @version : 1.0
 * @date ： 2020/8/27 23:01
 */
public class PersonBean {
    public static void main(String[] args) {
        Person person = new PersonFactory().getPerson("black");
        person.getPersonColor();
        person = new PersonFactory().getPerson("white");
        person.getPersonColor();
        person = new PersonFactory().getPerson("yellow");
        person.getPersonColor();
        person = new PersonFactory().getPerson("");
        person.getPersonColor();
    }
}
