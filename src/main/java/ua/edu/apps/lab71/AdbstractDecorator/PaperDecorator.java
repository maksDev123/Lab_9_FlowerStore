package ua.edu.apps.lab71.AdbstractDecorator;

import ua.edu.apps.lab71.store.Item;

public class PaperDecorator implements ItemDecorator{

    ItemDecorator decorator;
    Item item;

    public PaperDecorator(ItemDecorator decorator, Item item){
        this.decorator = decorator;
        this.item = item;
    }
    @Override
    public String getDescription() {
        return this.decorator.getDescription() + " Wrapped in Paper";
    }
    public double getPrice(){
        return 13 + decorator.getPrice();
    }
    
}
