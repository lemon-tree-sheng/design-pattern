package org.sheng.designpattern.decorator;

/**
 * @author sheng 2018/11/25
 * @desc todo
 */
public class PantsDecorator extends AbstractDecorator{
    PantsDecorator(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.println("老王穿上了裤子.");
    }

    @Override
    public int cost() {
        return person.cost() + 100;
    }
}
