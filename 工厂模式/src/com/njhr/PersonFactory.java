package com.njhr;

import com.njhr.service.Person;
import com.njhr.service.impl.BlackPerson;
import com.njhr.service.impl.WhitePerson;
import com.njhr.service.impl.YellowPerson;

/**
 * @author ： Guo Zhaoning
 * @version : 1.0
 * @date ： 2020/8/27 22:57
 */
public class PersonFactory {
    public Person getPerson(String personTypeName) {
        if ("black".equals(personTypeName)) {
            return new BlackPerson();
        } else if ("yellow".equals(personTypeName)) {
            return new YellowPerson();
        } else if ("white".equals(personTypeName)) {
            return new WhitePerson();
        } else {
            return null;
        }
    }
}
