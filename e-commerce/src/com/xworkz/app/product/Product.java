package com.xworkz.app.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private int id;
    private double price;
    private String type;
    private String name;


}
