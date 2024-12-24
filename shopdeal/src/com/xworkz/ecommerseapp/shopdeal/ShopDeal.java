package com.xworkz.ecommerseapp.shopdeal;

import com.xworkz.ecommerseapp.customer.Customer;
import com.xworkz.ecommerseapp.constant.Gender;

import java.util.Arrays;

import static java.lang.Math.pow;

public class ShopDeal {
    Customer customers[] = new Customer[5];
    int index;

    public boolean addCustomer(Customer customer) {
        boolean isCustomerAdded = false;
        if (customer != null) {
            if (index < customers.length) {
                if (customer.getId() > 0 &&
                        customer.getName() != null &&
                        customer.getDob() != null &&
                        customer.getAge()>18 &&
                        customer.getEmail() != null &&
                        customer.getGender() != null &&
                        (customer.getPhoneNumber() > pow(10, 9) && customer.getPhoneNumber() < pow(10, 10))) {
                    customers[index++] = customer;
                    isCustomerAdded = true;
                } else {
                    System.out.println("Fields are incorrect");
                }
            } else {
                System.out.println("Memory is full");
            }
        } else {
            System.out.println("Customer fields are empty");
        }
        return isCustomerAdded;
    }

    public void getAllCustomerDetails() {
        int count = 0;
        for (Customer customer : customers) {
            if (customer != null) {
                count++;
                System.out.println("Customer details are: ");
                System.out.println("-----------------");
                System.out.println("Customer id: " + customer.getId());
                System.out.println("customer name: " + customer.getName());
                System.out.println("customer dob: " + customer.getDob());
                System.out.println("customer gender: " + customer.getGender());
                System.out.println("customer phone number: " + customer.getPhoneNumber());
                System.out.println("customer email: " + customer.getEmail());
                System.out.println("Is customer placed: " + customer.isOrderPlaced());
                System.out.println("--------o---------------o--------------");
            }
        }
        if (count < customers.length) {
            System.out.println(customers.length - count + " more customers can be added");
            System.out.println("--------o---------------o--------------");
        }
    }


    public String getNameById(int id) {
        String name = null;
        for(Customer customer:customers){
            //  System.out.println("for loop");
            if(customer.getId()==id){
                // System.out.println("if condition");
                name = customer.getName();
                break;
            }
        }
        if(name == null)
            System.out.println("id "+id+" not found");
        return name;
    }

    public Gender getGenderByName(String name) {
        Gender gender=null;
        for(Customer customer: customers){
            if(customer.getName()==name){
                gender = customer.getGender();
                break;
            }
        }
        if(gender==null)
            System.out.println("name "+name+" not found");
        return gender;
    }

    public long getPhoneNumberByName(String name) {
        long phoneNumber=0;
        for(Customer customer: customers){
            if(customer.getName()==name){
                phoneNumber = customer.getPhoneNumber();
                break;
            }
        }
        if(phoneNumber==0)
            System.out.println("name "+name+" not found");
        return phoneNumber;
    }

    public String getEmailByName(String name) {
        String email=null;
        for(Customer customer: customers){
            if(customer.getName()==name){
                email = customer.getEmail();
                break;
            }
        }
        if(email==null)
            System.out.println("name "+name+" not found :(");
        return email;
    }

    public int[] getIdByAge(int age) {
        int count = 0;
        for (Customer customer : customers) {
            if (customer.getAge()==age) {
                count++;
            }
        }
        int id[] = new int[count];
        int start = 0, initial = 0;
        for (Customer customer : customers) {
            if (customer.getAge()==age) {
                id[initial++] = customer.getId();
            }
        }
        return id;
    }


    public int getIdByDob(String dob) {
        int id = 0;
        for(Customer customer:customers){
            if(customer.getDob()==dob){
                id = customer.getId();
                break;
            }
        }
        if(id == 0)
            System.out.println("dob "+dob+" not found :(");
        return id;
    }

    public boolean updateEmailById(int id, String updatedEmail) {
        boolean isEmailUpdated=false;
        for(int start=0;start<customers.length;start++){
            if(customers[start].getId()==id){
                customers[start].setEmail(updatedEmail);
                isEmailUpdated=true;
                break;
            }
        }
        if(!isEmailUpdated)
            System.out.println("id "+id+" not found:(");
        return isEmailUpdated;
    }

    public boolean updatePhoneNumberByName(String name, long updatePhoneNumber) {
        boolean isPhoneNumberUpdated=false;
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                customer.setPhoneNumber(updatePhoneNumber);
                isPhoneNumberUpdated = true;
                break;
            }
        }
        if(!isPhoneNumberUpdated)
            System.out.println("name "+name+" not found:(");
        return isPhoneNumberUpdated;
    }

    public boolean updateIsOrderPlacedByName(String name, boolean isOrderPlaced) {
        boolean isOrderPlacedUpdated=false;
        for(Customer customer:customers){
            if(customer.getName().equals(name)){
                customer.setOrderPlaced(isOrderPlacedUpdated);
                isOrderPlaced=true;
                break;
            }
        }
        if(!isOrderPlaced)
            System.out.println("name "+name+" not found:(");
        return isOrderPlaced;
    }

    public boolean deleteCustomerById(int id) {
        boolean isCustomerDeleted=false;
        int start, size;
        for(start=0,size=0;start<customers.length;start++){
            if(customers[start]!=null){
                if(customers[start].getId()!=id){
                    customers[size++]=customers[start];
                }else{
                    isCustomerDeleted=true;
                }
            }
        }
        if(size==0){
            System.out.println("No customers available");
        }else{
            customers= Arrays.copyOf(customers,size);
        }
        return isCustomerDeleted;
    }
}

