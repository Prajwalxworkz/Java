package com.xworkz.bookingapp.login;

import com.xworkz.bookingapp.register.Registration;

public class Login extends Registration {

    public void login(String userName, String password){
        if(this.getUserName()==userName && this.getPassword()==password){
            System.out.println("logged in successfully!!");
        }else {
            System.out.println("Invalid user name or password!!");
        }

    }
    public void login(long mobileNumber, String password){
        if(this.getMobileNumber()==mobileNumber && this.getPassword()==password){
            System.out.println("logged in successfully!!");
        }else {
            System.out.println("Invalid user name or password!!");
        }

    }
}
