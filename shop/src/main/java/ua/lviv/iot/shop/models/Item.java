package ua.lviv.iot.shop.models;

import lombok.*;
import ua.lviv.iot.shop.enums.Country;
import ua.lviv.iot.shop.enums.Gender;
import ua.lviv.iot.shop.enums.Size;
import ua.lviv.iot.shop.enums.Target;

import javax.persistence.*;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
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

