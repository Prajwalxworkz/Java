package com.xworkz.methodoverriding.markets.market;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class Market {
    private String name;
    private String location;
    private String shop;
    private String type;

    public Market() {
        System.out.println("Market is any place or venue where buyers and sellers can exchange goods and services.");
    }
    public void exchange(){
        System.out.println("invoked market class method");
        System.out.println("Exchange takes place in the location allocated by the municipality");
    }

    public void getMarketInfo(){
        System.out.println("Data: ");
        System.out.println("Name: "+getName());
        System.out.println("Location: "+getLocation());
        System.out.println("Shop: "+getShop());
        System.out.println("Type: "+getType());
    }
}

