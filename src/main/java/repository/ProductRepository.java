package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.muniz.Spring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
