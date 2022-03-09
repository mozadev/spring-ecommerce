package com.curso.aplicativoWeb.controller;


import com.curso.aplicativoWeb.model.Product;


import com.curso.aplicativoWeb.model.User;
import com.curso.aplicativoWeb.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.*;// only for remember
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductController {

    private final Logger LOGGER= LoggerFactory.getLogger(ProductController.class);

    @Autowired  // no se instancia sino el mismo contenedor de spring lo instancia
    private ProductService productService;


    @GetMapping("")
    public String show(){

        return"productos/show";
    }
    @GetMapping("/create")
    public String create()
    {
        return "productos/create";
    }

    @PostMapping("/save")
    public String save(Product product){
        LOGGER.info("this is the object product {}",product);
        User u=new User(1,"","","","","","","");
        product.setUser(u);
        productService.save(product);

        return "redirect:/productos";
    }

}
