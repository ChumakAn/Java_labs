package ua.lviv.iot.shop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.shop.models.Shoe;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/orders")
@RestController
public class ShopController {
    private final Map<Integer, Shoe> shoes = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public Collection<Shoe> getShoes() {
        return new ArrayList<Shoe>(shoes.values());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shoe> getShoe(@PathVariable("id") Integer id) {

        if (shoes.get(id) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(shoes.get(id));

    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Shoe createShoes(final @RequestBody Shoe shoe) {
        shoe.setId(idCounter.incrementAndGet());
        shoes.put(shoe.getId(), shoe);
        return shoe;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Shoe> deleteShoes(@PathVariable("id") int id) {
        HttpStatus status;
        if (shoes.get(id) == null) {
            status = HttpStatus.NOT_FOUND;
        } else {
            status = HttpStatus.OK;
            shoes.remove(id);
        }

        return ResponseEntity.status(status).build();

    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Shoe> updateShoes(final @PathVariable("id") int id, final @RequestBody Shoe shoe) {
        HttpStatus status;
        if (shoes.get(id) == null) {
            status = HttpStatus.NOT_FOUND;
        } else {
            status = HttpStatus.OK;
            shoe.setId(id);
            shoes.put(id, shoe);
        }
        return ResponseEntity.status(status).build();
    }
}
