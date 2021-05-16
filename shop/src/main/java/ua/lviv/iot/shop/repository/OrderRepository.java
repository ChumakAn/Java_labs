package ua.lviv.iot.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.shop.models.Shoe;

public interface OrderRepository extends JpaRepository<Shoe, Integer> {
}