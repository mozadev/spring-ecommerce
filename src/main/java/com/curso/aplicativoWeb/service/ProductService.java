package com.curso.aplicativoWeb.service;

import com.curso.aplicativoWeb.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public Product save(Product product);
    public Optional<Product>get(Integer id); // we cant validate if object exit on database
    public void update(Product product);
    public void delete(Integer id);
    public List<Product>findAll();



}
