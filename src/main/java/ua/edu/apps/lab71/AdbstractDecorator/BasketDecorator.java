package ua.edu.apps.lab71.AdbstractDecorator;

import ua.edu.apps.lab71.item.Flower;
import ua.edu.apps.lab71.store.Item;

public class BasketDecorator implements ItemDecorator {
    ItemDecorator decorator;
    Item item;
    public BasketDecorator(ItemDecorator decorator, Item item){
        this.decorator = decorator;
        this.item = item;
    }
    @Override
    public String getDescription() {
        return this.decorator.getDescription() + " Wrapped in backet ";   
    }
    public double getPrice(){
        return 4 + this.decorator.getPrice();
    }
}
