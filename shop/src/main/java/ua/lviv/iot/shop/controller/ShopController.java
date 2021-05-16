package ua.lviv.iot.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.shop.models.Shoe;
import ua.lviv.iot.shop.service.OrderService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/orders")
public class ShopController {
    @Autowired
    OrderService orderService;

    @GetMapping
    public List<Shoe> getList() {
        return orderService.listAllShoes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shoe> getShoe(@PathVariable Integer id) {
        try {
            Shoe shoe = orderService.getShoe(id);
            return new ResponseEntity<Shoe>(shoe, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Shoe>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping()
    public void addShoe(@RequestBody Shoe shoe) {
        orderService.saveShoe(shoe);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shoe> updateShoe(@RequestBody Shoe shoe, @PathVariable Integer id) {
        try {
            Shoe existShoe = orderService.getShoe(id);
            shoe.setId(id);
            orderService.saveShoe(shoe);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Shoe> deleteShoe(@PathVariable Integer id) {
        try {
            Shoe existShoe = orderService.getShoe(id);
            orderService.deleteShoe(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}