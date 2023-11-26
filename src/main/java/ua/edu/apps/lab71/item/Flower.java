package ua.edu.apps.lab71.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.apps.lab71.store.Item;



@Setter @Getter @ NoArgsConstructor @Entity
public class Flower extends Item {
    @Id
    private int id;
    private double sepalLength = 0;
    private FlowerColor color = FlowerColor.BLUE;
    private double price = 123;
    private FlowerType flowerType = FlowerType.ROSE;
    private String packagingInfo = "flower";

    public Flower(int id) {
        this.id = id;
    }

    public Flower(Flower flowerCopy) {
        this.color = flowerCopy.color;
        this.flowerType = flowerCopy.flowerType;
        this.sepalLength = flowerCopy.sepalLength;
        this.price = flowerCopy.price;
    }


    public Flower(FlowerColor color, FlowerType flowerType,
     double sepalLength, double price) {
        this.color = color;
        this.flowerType = flowerType;
        this.sepalLength = sepalLength;
        this.price = price;
    }
    public String getColor() {
        return color.toString();
    }

    public String getDescription() {
        return packagingInfo;
    }
}
