package org.sheng.designpattern.decorator;

/**
 * @author sheng 2018/11/25
 * @desc todo
 */
public abstract class AbstractDecorator implements Person {
    protected Person person;

    AbstractDecorator(Person person) {
        this.person = person;
    }
}
