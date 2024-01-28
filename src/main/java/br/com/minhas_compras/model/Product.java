package br.com.minhas_compras.model;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private String name;
    private String code;
    //quantity present in bag
    private Float quantity;
    //value per unit
    private BigDecimal value;
    //system of unity global
    private String unity;
    //Total value in note
    private BigDecimal totalValue;
}
