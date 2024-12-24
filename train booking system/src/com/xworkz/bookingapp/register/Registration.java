package com.xworkz.bookingapp.register;

public class Registration {
    private String userName;
    private String fullName;
    private String password;
    private String confirmPassword;
    private long mobileNumber;

    public Registration() {
        System.out.println("Registration page");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void confirmation(){
        if(getPassword()==getConfirmPassword()){
            System.out.println("Password set successfully");
        }
    }
}
