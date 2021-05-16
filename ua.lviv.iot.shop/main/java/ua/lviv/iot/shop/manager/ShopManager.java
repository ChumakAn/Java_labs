package ua.lviv.iot.shop.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.lviv.iot.shop.models.Item;
import ua.lviv.iot.shop.enums.SortOrder;
import ua.lviv.iot.shop.enums.Target;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class ShopManager {
    private List<Item> goods;


    public static void printItems(final List<Item> goods) {
        goods.forEach(System.out::println);
    }

    public List<Item> searchByOccasion(final Target target) {
        return goods.stream().filter(item -> item.getTarget() == target).collect(Collectors.toList());
    }


    public List<Item> sortByBrand(final SortOrder sortOrder) {
        List<Item> sortedList = new ArrayList<>(goods);
        if (sortOrder == SortOrder.ASC) {
            sortedList.sort((item1, item2) -> item1.getBrand().compareTo(item2.getBrand()));
        } else {
            sortedList.sort((item1, item2) -> item2.getBrand().compareTo(item1.getBrand()));
        }
        return sortedList;
    }


    public List<Item> sortByPrice(final SortOrder sortOrder) {
        List<Item> sortedList = new ArrayList<>(goods);
        if (sortOrder == SortOrder.ASC) {
            sortedList.sort((item1, item2) -> item1.getPrice().compareTo(item2.getPrice()));
        } else {
            sortedList.sort((item1, item2) -> item2.getPrice().compareTo(item1.getPrice()));
        }
        return sortedList;
    }
}