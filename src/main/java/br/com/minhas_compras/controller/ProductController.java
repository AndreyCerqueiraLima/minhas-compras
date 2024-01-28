package br.com.minhas_compras.controller;

import br.com.minhas_compras.model.Product;
import br.com.minhas_compras.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<?> create(String sefazCode){
        List<Product> createdProducts = this.productService.create(sefazCode);
        return ResponseEntity.ok(createdProducts);
    }
}
