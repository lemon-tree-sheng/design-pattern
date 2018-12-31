package org.sheng.designpattern.decorator;

/**
 * @author sheng 2018/11/25
 * @desc todo
 */
public class Main {
    public static void main(String[] args) {
        LaoWang laoWang = new LaoWang();
        laoWang.show();
        showCost(laoWang.cost());

        HatDecorator hatDecorator = new HatDecorator(laoWang);
        hatDecorator.show();
        showCost(hatDecorator.cost());
        PantsDecorator pantsDecorator = new PantsDecorator(hatDecorator);
        pantsDecorator.show();
        showCost(pantsDecorator.cost());
    }

    public static void showCost(int cost) {
        System.out.println("共花费了" + cost + "元");
    }
}
