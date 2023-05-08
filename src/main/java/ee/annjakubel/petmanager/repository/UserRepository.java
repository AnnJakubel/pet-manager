package ee.annjakubel.petmanager.repository;

import ee.annjakubel.petmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
