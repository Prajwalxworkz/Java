package com.xworkz.methodoverriding.markets;

import com.xworkz.methodoverriding.markets.market.Market;
import com.xworkz.methodoverriding.markets.onlinemarket.OnlineMarket;
import com.xworkz.methodoverriding.markets.supermarket.SuperMarket;

public class MarketRunner {
    public static void main(String[] args) {
        Market market = new Market();
        market.exchange();
        market.setName("APMC");
        market.setLocation("Hassan");
        market.setShop("Local Market");
        market.setType("Government");
        market.getMarketInfo();
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        Market market1 = new SuperMarket();
        market1.exchange();
        market1.setName("Kasturi mart");
        market1.setLocation("Kasturi nagar");
        market1.setShop("Super market");
        market1.setType("Private");
        market1.getMarketInfo();
        System.out.println("--------------------------------");
        SuperMarket market2 = new SuperMarket();
        market2.exchange();
        market2.setName("Kalyan mart");
        market2.setLocation("Kalyan nagar");
        market2.setShop("Super market");
        market2.setType("Private");
        market2.getMarketInfo();
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        Market market3 = new OnlineMarket();
        market3.exchange();
        market3.setName("Zepto");
        market3.setLocation("Kasturi nagar");
        market3.setShop("Online app");
        market3.setType("Online market");
        market3.getMarketInfo();
        System.out.println("--------------------------------");
        OnlineMarket onlineMarket = new OnlineMarket();
        onlineMarket.exchange();
        onlineMarket.setName("Zepto lite");
        onlineMarket.setLocation("Kasturi nagar");
        onlineMarket.setShop("Online app");
        onlineMarket.setType("Online market");
        onlineMarket.getMarketInfo();


    }
}
