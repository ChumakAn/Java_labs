package ua.lviv.iot.shop.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.shop.enums.Country;
import ua.lviv.iot.shop.enums.Gender;
import ua.lviv.iot.shop.enums.Size;
import ua.lviv.iot.shop.enums.Target;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Item {
    private Size size;
    private Gender gender;
    private String name;
    private String color;
    private String material;
    private String brand;
    private Country originCountry;
    private Double price;
    private Target target;

    @Override
    public String toString() {
        return "Item" +
                "size=" + size +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", brand='" + brand + '\'' +
                ", originCountry=" + originCountry +
                ", price=" + price +
                ", target=" + target;
    }
}
