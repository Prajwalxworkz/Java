package com.xworkz.methodoverriding.markets.onlinemarket;

import com.xworkz.methodoverriding.markets.market.Market;

public class OnlineMarket extends Market {
    @Override
    public void exchange(){
        System.out.println("invoked online market class method");
        System.out.println("Exchange takes place through the application or app");
    }
}
