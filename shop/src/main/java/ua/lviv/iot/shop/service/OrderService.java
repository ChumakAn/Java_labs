package ua.lviv.iot.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.iot.shop.models.Shoe;
import ua.lviv.iot.shop.repository.OrderRepository;

import java.util.List;
@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Shoe> listAllShoes() {
        return orderRepository.findAll();
    }
    public void saveShoe(Shoe shoe) {
        orderRepository.save(shoe);

    }
    public Shoe getShoe(Integer id) {
        return orderRepository.findById(id).get();
    }
    public void deleteShoe(Integer id) {
        orderRepository.deleteById(id);
    }
}
