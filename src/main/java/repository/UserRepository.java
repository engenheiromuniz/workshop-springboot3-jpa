package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muniz.Spring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
