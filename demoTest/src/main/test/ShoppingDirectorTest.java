package main.test;

import main.java.builders.AppleBuilders;
import main.java.builders.Builders;
import main.java.builders.MangoBuilders;
import main.java.builders.StrawberryBuilders;
import main.java.director.ShoppingDirector;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShoppingDirectorTest {

    @Test
    public void getTotalCost1() {
        // 方案1
        ShoppingDirector director = new ShoppingDirector();
        List<Builders> buildersList = new ArrayList<>();
        Builders appleBuilders = new AppleBuilders().builderPrice(8).builderNum(5).builderDiscount(1.0);
        Builders StrawberryBuilders = new StrawberryBuilders().builderPrice(13).builderNum(5).builderDiscount(1.0);
        buildersList.add(appleBuilders);
        buildersList.add(StrawberryBuilders);
        director.setFruitBuilder(buildersList);
        double totalCost = director.getTotalCost();
        System.out.println("方案1总价格为：" + totalCost);
        Assert.assertEquals((Double) 105.0, (Double) totalCost);
    }

    @Test
    public void getTotalCost2() {
        // 方案2
        ShoppingDirector director = new ShoppingDirector();
        List<Builders> buildersList = new ArrayList<>();
        Builders appleBuilders = new AppleBuilders().builderPrice(8).builderNum(5).builderDiscount(1.0);
        Builders StrawberryBuilders = new StrawberryBuilders().builderPrice(13).builderNum(5).builderDiscount(1.0);
        Builders mangoBuilders = new MangoBuilders().builderPrice(20).builderNum(5).builderDiscount(1.0);
        buildersList.add(appleBuilders);
        buildersList.add(StrawberryBuilders);
        buildersList.add(mangoBuilders);
        director.setFruitBuilder(buildersList);
        double totalCost = director.getTotalCost();
        System.out.println("方案2总价格为：" + totalCost);
        Assert.assertEquals((Double) 205.0, (Double) totalCost);
    }

    @Test
    public void getTotalCost3() {
        // 方案3
        ShoppingDirector director = new ShoppingDirector();
        List<Builders> buildersList = new ArrayList<>();
        Builders appleBuilders = new AppleBuilders().builderPrice(8).builderNum(5).builderDiscount(1.0);
        Builders StrawberryBuilders = new StrawberryBuilders().builderPrice(13).builderNum(5).builderDiscount(0.8);
        Builders mangoBuilders = new MangoBuilders().builderPrice(20).builderNum(5).builderDiscount(1.0);
        buildersList.add(appleBuilders);
        buildersList.add(StrawberryBuilders);
        buildersList.add(mangoBuilders);
        director.setFruitBuilder(buildersList);
        double totalCost = director.getTotalCost();
        System.out.println("方案3总价格为：" + totalCost);
        Assert.assertEquals((Double) 192.0, (Double) totalCost);
    }

    @Test
    public void getTotalCost4() {
        // 方案3
        ShoppingDirector director = new ShoppingDirector();
        List<Builders> buildersList = new ArrayList<>();
        Builders appleBuilders = new AppleBuilders().builderPrice(8).builderNum(5).builderDiscount(1.0);
        Builders StrawberryBuilders = new StrawberryBuilders().builderPrice(13).builderNum(5).builderDiscount(0.8);
        Builders mangoBuilders = new MangoBuilders().builderPrice(20).builderNum(5).builderDiscount(1.0);
        buildersList.add(appleBuilders);
        buildersList.add(StrawberryBuilders);
        buildersList.add(mangoBuilders);
        director.setFruitBuilder(buildersList);
        double totalCost = director.getActivityTotalCost();
        System.out.println("方案4总价格为：" + totalCost);
        Assert.assertEquals((Double) 182.0, (Double) totalCost);
    }
}