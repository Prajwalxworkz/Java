package com.xworkz.business;

import com.xworkz.business.commercialspace.OfficeSpace;
import com.xworkz.business.mybusiness.FancyStore;

public class MyBusinessRunner {
    public static void main(String[] args) {
        OfficeSpace officeSpace= new FancyStore();
        long profit=officeSpace.profit();
        System.out.println("my profit is "+profit);
    }
}
