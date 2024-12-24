package com.xworkz.foodapp.mainpage;

import com.xworkz.foodapp.login.Login;

public class Home {
    Login login;
//    public void loginPage(String email, String password){
//        login.email=email;
//        login.password=password;
//        System.out.println("Email: "+getEmail());
//        System.out.println("Logged in successfully");
//    }

    public Home() {
    }

    public void loginPage(Login login, String email, String password){
        login.setEmail(email);
        login.setPassword(password);
        System.out.println("Email: "+login.getEmail());
        System.out.println("Logged in successfully");
    }
    public void loginPage(Login login,long phoneNumber, String password){
        login.setPhoneNumber(phoneNumber);
        login.setPassword(password);
        System.out.println("Phone number: "+login.getPhoneNumber());
        System.out.println("Logged in successfully");
    }

}
