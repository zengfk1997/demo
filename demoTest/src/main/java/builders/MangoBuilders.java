package main.java.builders;

public class MangoBuilders extends Builders {

    public MangoBuilders() {
        fruit.setName("芒果");
    }

    @Override
    public Builders builderPrice(int price) {
        fruit.setPrice(price);
        return this;
    }

    @Override
    public Builders builderNum(int num) {
        fruit.setNum(num);
        return this;
    }

    @Override
    public Builders builderDiscount(double discount) {
        fruit.setDiscount(discount);
        return this;
    }
}
