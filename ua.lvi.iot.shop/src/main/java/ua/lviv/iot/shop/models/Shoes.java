package ua.lviv.iot.shop.models;

import lombok.*;
import ua.lviv.iot.shop.enums.*;


@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, includeFieldNames = true)

public class Shoes extends Item {
    private Season season;

    public Shoes(final Size size, final Gender gender, final String name, final String color, final String material, final String brand, final Country originCountry, final Double price, final Target target, final Season season) {
        super(size, gender, name, color, material, brand, originCountry, price, target);
        this.season = season;
    }

}
