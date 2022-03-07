package com.curso.ecommerce.repository;

import com.curso.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // lo va inyectar en el service
public interface ProductRepository extends JpaRepository<Product,Integer> {




}
