package za.co.multitenant.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.multitenant.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}