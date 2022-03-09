package com.curso.aplicativoWeb.repository;

import com.curso.aplicativoWeb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // lo va inyectar en el service
public interface ProductRepository extends JpaRepository<Product,Integer> {




}
