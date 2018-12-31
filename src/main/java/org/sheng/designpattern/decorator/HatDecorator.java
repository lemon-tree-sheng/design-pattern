package org.sheng.designpattern.decorator;

/**
 * @author sheng 2018/11/25
 * @desc todo
 */
public class HatDecorator extends AbstractDecorator{
    HatDecorator(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.println("老王戴上了帽子.");
    }

    @Override
    public int cost() {
        return person.cost() + 50;
    }


}
