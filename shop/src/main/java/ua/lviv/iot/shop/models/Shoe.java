package ua.lviv.iot.shop.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;
import ua.lviv.iot.shop.enums.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, includeFieldNames = true)
@Table(name = "items")
public class Shoe extends Item {

    private Season season;

    public Shoe(final Integer id, final Size size, final Gender gender, final String name, final String color, final String material, final String brand, final Country originCountry, final Double price, final Target target, final Season season) {
        super(id, size, gender, name, color, material, brand, originCountry, price, target);
        this.id = id;
        this.season = season;
    }
}