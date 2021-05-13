package ua.lviv.iot.shop;

import ua.lviv.iot.shop.enums.*;
import ua.lviv.iot.shop.manager.ShopManager;
import ua.lviv.iot.shop.models.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Item> listOfItems = List.of(
                new Shirts(Size.S, Gender.FEMALE, "Shirt", "blue", "cotton", "Zara", Country.BANGLADESH, 1199.99, Target.SPECIAL_OCCASION, Length.MIDDLE),
                new Shoes(Size.M, Gender.MALE, "boots", "black", "leather", "CCC", Country.CHINA, 2300.75, Target.CASUAL, Season.WINTER),
                new Trousers(Size.XL, Gender.MALE, "shorts", "grey", "cotton", "Reserved", Country.UKRAINE, 679.5, Target.SPORT, Type.JEANS)
        );
        ShopManager shopManager = new ShopManager(listOfItems);
        ShopManager.printItems(shopManager.searchByOccasion(Target.SPECIAL_OCCASION));
        System.out.print("\n");
        ShopManager.printItems(shopManager.sortByBrand(SortOrder.ASC));
        System.out.print("\n");
        ShopManager.printItems(shopManager.sortByPrice(SortOrder.DESC));
    }
}