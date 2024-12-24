package com.xworkz.foodapp;

import com.xworkz.foodapp.login.Login;
import com.xworkz.foodapp.mainpage.Home;

public class LoginRunner {
    public static void main(String[] args) {
        Home home = new Home();
        Login login = new Login();
        System.out.println(login);
        //login.Login();
        home.loginPage(login,"prajwal@gmail.com","qwerty");
        System.out.println(login);
        home.loginPage(login,7019595865L,"qwerty");
        System.out.println(login);
    }
}
