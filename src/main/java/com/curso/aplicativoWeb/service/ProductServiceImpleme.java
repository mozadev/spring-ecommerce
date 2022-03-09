package com.curso.aplicativoWeb.service;

import com.curso.aplicativoWeb.model.Product;
import com.curso.aplicativoWeb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service // nos permita inyectar en el controller esta clase para hacer el llamado direct a los metodos crud
public class ProductServiceImpleme implements ProductService {

    @Autowired // sirve para know q estamos inyecting a esta clase un object
    private ProductRepository productRepository;




    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> get(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);// save se comporta de la sig manera, si le mandamos un null , lo crea, pero si mandas con un id lo actualiza

    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);

    }
}
