package ua.edu.apps.lab71.AdbstractDecorator;

import ua.edu.apps.lab71.store.Item;

public class RibbonDecorator implements ItemDecorator{
    ItemDecorator decorator;
    Item item;

    public RibbonDecorator(ItemDecorator decorator, Item item){
        this.item = item;
        this.decorator = decorator;
    }
    @Override
    public String getDescription() {
        return this.decorator.getDescription() + " Wrapped in ribbon";
    }
    public double getPrice(){
        return this.decorator.getPrice() + 40;
    }
    
}
