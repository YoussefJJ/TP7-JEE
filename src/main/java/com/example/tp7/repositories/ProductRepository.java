package com.example.tp7.repositories;
import com.example.tp7.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Long>{
	Product findByProdName(final String prodName);
}
