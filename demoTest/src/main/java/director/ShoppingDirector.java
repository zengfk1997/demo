package main.java.director;

import main.java.builders.Builders;
import java.util.List;

public class ShoppingDirector {
    private List<Builders> buildersList;

    public void setFruitBuilder(List<Builders> buildersList) {
        this.buildersList = buildersList;
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Builders builders : buildersList) {
            totalCost += builders.build().getCost();
        }
        return totalCost;
    }

    public double getActivityTotalCost() {
        double totalCost = getTotalCost();
        return totalCost >= 100 ? totalCost - 10 : totalCost;
    }
}
