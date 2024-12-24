package com.xworkz.methodoverriding.markets.supermarket;

import com.xworkz.methodoverriding.markets.market.Market;

public class SuperMarket extends Market {
    @Override
    public void exchange(){
        System.out.println("invoked super market class method");
        System.out.println("Exchange takes place in the shop/building and all the items are available in one place");
    }
}
