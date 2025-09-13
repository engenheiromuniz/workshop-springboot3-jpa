package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muniz.Spring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
