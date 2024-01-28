package br.com.minhas_compras.service;

import br.com.minhas_compras.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final SefazService sefazService;

    private List<Product> create(String sefazCode){
        List<Product> products = new ArrayList<>();
    }

}
