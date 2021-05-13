package ua.lviv.iot.shop.models;

import lombok.*;
import ua.lviv.iot.shop.enums.Country;
import ua.lviv.iot.shop.enums.Gender;
import ua.lviv.iot.shop.enums.Size;
import ua.lviv.iot.shop.enums.Target;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class Item {
    protected Size size;
    protected Gender gender;
    protected String name;
    protected String color;
    protected String material;
    protected String brand;
    protected Country originCountry;
    protected Double price;
    protected Target target;
}
