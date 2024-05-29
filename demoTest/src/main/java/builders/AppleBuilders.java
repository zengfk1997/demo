package main.java.builders;

public class AppleBuilders extends Builders {

    public AppleBuilders() {
        fruit.setName("苹果");
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
