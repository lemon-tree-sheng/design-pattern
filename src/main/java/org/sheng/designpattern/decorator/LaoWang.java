package org.sheng.designpattern.decorator;

import lombok.Data;

/**
 * @author sheng 2018/11/25
 * @desc todo
 */
@Data
public class LaoWang implements Person{

    @Override
    public void show() {
        System.out.println("老王啥也没穿。");
    }

    @Override
    public int cost() {
        return 0;
    }
}
