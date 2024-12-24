package com.xworkz.app;

import com.xworkz.app.mesho.Mesho;
import com.xworkz.app.product.Product;

import java.util.Scanner;

public class MeshoRunner {
    public static void main(String[] args) {
        Mesho mesho =new Mesho();
        Product product  = new Product();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the id");
        int id=s.nextInt();
        product.setId(id);
        System.out.println("Enter the product name");
        s.nextLine();
        String name=s.nextLine();
        product.setName(name);
        System.out.println("Enter the product type");
        s.nextLine();
        String type=s.nextLine();
        product.setType(type);
        System.out.println("Enter the price");
        double price=s.nextDouble();
        product.setPrice(price);
        System.out.println(product);
    /*
        boolean isProductAdded =mesho.addProduct(product);
        System.out.println("Is product added: "+isProductAdded);
        mesho.getProductDetails();
        System.out.println("---------------------------------");
        boolean isTypeUpdated=mesho.updateType("plastic");
        System.out.println("Is product type updated: "+isTypeUpdated);
        mesho.getProductDetails();
        mesho.deleteReference();
        System.out.println("---------------------------------");
//        mesho.getProductDetails();

     */

    }
}
