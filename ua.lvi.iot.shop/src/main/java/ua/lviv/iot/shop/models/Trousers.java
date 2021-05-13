package ua.lviv.iot.shop.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ua.lviv.iot.shop.enums.*;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, includeFieldNames = true)

public class Trousers extends Item {
    private Type type;

    public Trousers(final Size size, final Gender gender, final String name, final String color, final String material, final String brand, final Country originCountry, final Double price, final Target target, final Type type) {
        super(size, gender, name, color, material, brand, originCountry, price, target);
        this.type = type;

    }
}