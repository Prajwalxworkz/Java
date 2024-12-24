package com.xworkz.app.mesho;

import com.xworkz.app.product.Product;

public class Mesho {
    Product product;
    public boolean addProduct(Product product){
        boolean isProductAdded=false;
        if(product!=null){
            if(product.getId()>0 && product.getName()!=null){
                this.product=product;
            }
        }
        else{
            System.out.println("Product fields are empty");
        }
        return isProductAdded;
    }

    public void getProductDetails(){
        System.out.println("The product id is "+product.getId());
        System.out.println("The product name is "+product.getName());
        System.out.println("The product type is "+product.getType());
        System.out.println("The product price is "+product.getPrice());
    }

    public boolean updateType(String updatedType){
        boolean isTypeUpdated=false;
        if(updatedType!=null){
            product.setType(updatedType);
            isTypeUpdated=true;
        }
        return  isTypeUpdated;
    }

    public  void deleteReference(){
        if(product!=null){
            product=null;
        }
    }
}
