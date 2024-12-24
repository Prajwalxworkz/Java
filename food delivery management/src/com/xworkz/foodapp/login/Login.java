package com.xworkz.foodapp.login;

public class Login {
    private String email;
    private String password;
    private long phoneNumber;

    public Login() {
        System.out.println("can be accessed only when invoked");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Login(email="+this.email+", password="+this.password+", phoneNumber="+this.phoneNumber+")";
    }
}
