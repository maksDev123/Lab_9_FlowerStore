package ua.edu.apps.lab71.AdbstractDecorator;

import ua.edu.apps.lab71.store.Item;

public class ItemDecoratorDefault implements ItemDecorator{

    Item item;

    public ItemDecoratorDefault(Item item){
        this.item = item;
    }
    @Override
    public String getDescription() {
        return " ";
    }
    public double getPrice(){
        return this.item.getPrice();
    }
    
}
