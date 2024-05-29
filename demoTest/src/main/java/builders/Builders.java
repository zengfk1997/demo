package main.java.builders;

import main.java.model.Fruit;

public abstract class Builders {
    Fruit fruit = new Fruit();

    public abstract Builders builderPrice(int price);

    public abstract Builders builderNum(int num);

    public abstract Builders builderDiscount(double discount);

    public Fruit build() {
        return fruit;
    }
}
