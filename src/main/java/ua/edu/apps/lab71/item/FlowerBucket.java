package ua.edu.apps.lab71.item;

import java.util.ArrayList;
import java.util.List;

import ua.edu.apps.lab71.store.Item;

public class FlowerBucket extends Item {
    private List<FlowerPack> bucket;
    private String packagingInfo;
    public FlowerBucket(List<FlowerPack> bucket) {
        this.bucket = bucket;
    }

    public FlowerBucket() {
        this.bucket = new ArrayList<FlowerPack>();
    }

    public double getPrice() {
        double overalPrice = 0;
        for (FlowerPack f : this.bucket) {
            overalPrice += f.getPrice();
        }
        return overalPrice;
    }

    public String getDescription() {
        return packagingInfo;
    }
}
