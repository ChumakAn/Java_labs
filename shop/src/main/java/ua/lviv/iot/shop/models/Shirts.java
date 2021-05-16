package ua.lviv.iot.shop.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.shop.enums.*;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(callSuper = true, includeFieldNames = true)

public class Shirts extends Item {

    private Sleeves typeOfSleeves;
    private Length length;

    public Shirts(final Integer id, final Size size, final Gender gender, final String name, final String color,
                  final String material, final String brand, final Country originCountry,
                  final Double price, final Target target, final Length length) {
        super(id, size, gender, name, color, material, brand, originCountry, price, target);
        this.id = id;
        this.length = length;
    }
}