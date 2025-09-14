package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muniz.Spring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
