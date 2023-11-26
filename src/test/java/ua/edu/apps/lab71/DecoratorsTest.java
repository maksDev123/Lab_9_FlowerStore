package ua.edu.apps.lab71;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.apps.lab71.AdbstractDecorator.BasketDecorator;
import ua.edu.apps.lab71.AdbstractDecorator.ItemDecorator;
import ua.edu.apps.lab71.AdbstractDecorator.ItemDecoratorDefault;
import ua.edu.apps.lab71.AdbstractDecorator.RibbonDecorator;
import ua.edu.apps.lab71.item.FlowerColor;
import ua.edu.apps.lab71.item.Rose;
import ua.edu.apps.lab71.store.Item;

public class DecoratorsTest {
    

    @Test
    public void testDecoratorDescription() {

        Item rose = new Rose(FlowerColor.BLUE, 10.0, 10.0);

        ItemDecorator decorator = new ItemDecoratorDefault(rose);
        decorator = new BasketDecorator(decorator, rose);
        decorator = new RibbonDecorator(decorator, rose);

        Assertions.assertEquals(decorator.getDescription(), "  Wrapped in backet  Wrapped in ribbon");
        

        Item rose1 = new Rose(FlowerColor.BLUE, 10.0, 10.0);

        ItemDecorator decorator1 = new ItemDecoratorDefault(rose1);
        decorator1 = new RibbonDecorator(decorator1, rose1);
        decorator1 = new RibbonDecorator(decorator1, rose1);
        decorator1 = new RibbonDecorator(decorator1, rose1);


        Assertions.assertEquals(decorator1.getDescription(), "  Wrapped in ribbon Wrapped in ribbon Wrapped in ribbon");
        



        Item rose3 = new Rose(FlowerColor.BLUE, 10.0, 10.0);

        ItemDecorator decorator3 = new ItemDecoratorDefault(rose3);
        decorator3 = new RibbonDecorator(decorator3, rose3);
        decorator3 = new BasketDecorator(decorator3, rose3);


        Assertions.assertEquals(decorator3.getDescription(), "  Wrapped in ribbon Wrapped in backet ");
        


        

        // ItemDecorator flower2 = new Flower(); 
        // flower2 = new BasketDecorator(flower2);
        // flower2 = new RibbonDecorator(flower2);
        // flower2 = new PaperDecorator(flower2);

        // Assertions.assertEquals(flower2.getDescription(), " Wrapped in backet  Wrapped in ribbon Wrapped in Paper");
        


        // ItemDecorator flower3 = new Flower(); 
        // flower3 = new PaperDecorator(flower3);
        // flower3 = new PaperDecorator(flower3);
        // flower3 = new PaperDecorator(flower3);
        // flower3 = new PaperDecorator(flower3);
        // flower3 = new PaperDecorator(flower3);


        // Assertions.assertEquals(flower.getDescription(), " Wrapped in backet  Wrapped in ribbon");
        
    }


    @Test
    public void testDecoratorPrice() {
        Item rose = new Rose(FlowerColor.BLUE, 10.0, 10.0);

        ItemDecorator decorator = new ItemDecoratorDefault(rose);
        decorator = new BasketDecorator(decorator, rose);
        decorator = new RibbonDecorator(decorator, rose);


        Assertions.assertEquals(decorator.getPrice(), 54.0);
        


        Item rose1 = new Rose(FlowerColor.BLUE, 10.0, 10.0);

        ItemDecorator decorator1 = new ItemDecoratorDefault(rose1);
        decorator1 = new BasketDecorator(decorator1, rose1);
        decorator1 = new BasketDecorator(decorator1, rose1);


        Assertions.assertEquals(decorator1.getPrice(), 18.0);

        Item rose3 = new Rose(FlowerColor.BLUE, 10.0, 10.0);

        ItemDecorator decorator3 = new ItemDecoratorDefault(rose3);



        Assertions.assertEquals(decorator3.getPrice(), 10.0);
    }
       
}
