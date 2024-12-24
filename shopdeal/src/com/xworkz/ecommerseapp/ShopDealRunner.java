package com.xworkz.ecommerseapp;

import com.xworkz.ecommerseapp.constant.Gender;
import com.xworkz.ecommerseapp.customer.Customer;
import com.xworkz.ecommerseapp.shopdeal.ShopDeal;

import java.util.Scanner;

public class ShopDealRunner {
    public static void main(String[] args) {
        Customer customer=new Customer();
        Scanner s= new Scanner(System.in);
     //   System.out.println(customer);
        System.out.println("Enter the id");
        int id=s.nextInt();
        customer.setId(id);
        System.out.println("Enter the name");
        s.nextLine();
        String name=s.nextLine();
        customer.setName(name);
        System.out.println("Enter the age");
        int age=s.nextInt();
        customer.setAge(age);
        System.out.println("Enter the dob");
        s.nextLine();
        String dob=s.nextLine();
        customer.setDob(dob);
        System.out.println("Enter the email");
        s.nextLine();
        String email=s.nextLine();
        customer.setEmail(email);
        System.out.println("Enter the phone number");
        long phNum=s.nextLong();
        customer.setPhoneNumber(phNum);
        System.out.println("Enter the gender");
        s.nextLine();
        String gender=s.nextLine();
        customer.setGender(Gender.valueOf(gender));
        System.out.println("is order placed? : ");
        boolean isOrderPlaced=s.nextBoolean();
        customer.setOrderPlaced(isOrderPlaced);
        System.out.println(customer);

 /*       ShopDeal shopDeal=new ShopDeal();
        boolean isCustomerAdded=shopDeal.addCustomer(customer);
        System.out.println("Customer1 is added: "+isCustomerAdded);
        System.out.println("======================================");

        Customer customer1=new Customer();
        customer1.setId(2);
        customer1.setName("Bimba");
        customer1.setAge(27);
        customer1.setDob("05/08/1998");
        customer1.setEmail("bimba@gmail.com");
        customer1.setPhoneNumber(9453689245L);
        customer1.setGender(Gender.female);
        customer1.setOrderPlaced(true);
        boolean isCustomer1Added=shopDeal.addCustomer(customer1);
        System.out.println("Customer2 is added: "+isCustomer1Added);
        System.out.println("======================================");

        Customer customer2=new Customer();
        customer2.setId(3);
        customer2.setName("Chiranth");
        customer2.setAge(24);
        customer2.setDob("01/01/2001");
        customer2.setEmail("chiru@gmail.com");
        customer2.setPhoneNumber(7453689245L);
        customer2.setGender(Gender.male);
        customer2.setOrderPlaced(false);
        boolean isCustomer2Added=shopDeal.addCustomer(customer2);
        System.out.println("Customer3 is added: "+isCustomer2Added);
        System.out.println("======================================");

        Customer customer3=new Customer();
        customer3.setId(4);
        customer3.setName("Deepa");
        customer3.setAge(23);
        customer3.setDob("10/07/2001");
        customer3.setEmail("deepa@gmail.com");
        customer3.setPhoneNumber(7453689246L);
        customer3.setGender(Gender.female);
        customer3.setOrderPlaced(true);
        boolean isCustomer3Added=shopDeal.addCustomer(customer3);
        System.out.println("Customer4 is added: "+isCustomer3Added);
        System.out.println("======================================");

        Customer customer4=new Customer();
        customer4=customer3;
        System.out.println(customer4);
        int hashCode=customer4.hashCode();
        System.out.println(hashCode);
        boolean equal=customer4.equals(customer3);
        System.out.println(equal);
//        customer4.setId(5);
//        customer4.setName("AdamPasha");
//        customer4.setAge(35);
//        customer4.setDob("12/10/1989");
//        customer4.setEmail("adam@gmail.com");
//        customer4.setPhoneNumber(8453689246L);
//        customer4.setGender(Gender.others);
//        customer4.setOrderPlaced(false);
//        boolean isCustomer4Added=shopDeal.addCustomer(customer4);
//        System.out.println("Customer5 is added: "+isCustomer4Added);
//        System.out.println("======================================");
//
//        shopDeal.getAllCustomerDetails();

       /* String email=shopDeal.getEmailByName("Bimba");
        System.out.println("Bimba's email is "+email);
        System.out.println("================================");

        int[] id=shopDeal.getIdByAge(24);
        System.out.println("The customers of age 22 are:");
        int start=1;
        for(int s:id){
            System.out.println(start++ +".id="+s);
        }
        System.out.println("===============================");

        String name= shopDeal.getNameById(1);
        System.out.println("id 1 represents "+name);
        String name1= shopDeal.getNameById(3);
        System.out.println("id 3 represents "+name1);
        System.out.println("===============================");

        Gender gender=shopDeal.getGenderByName("AdamPasha");
        System.out.println("gender of adam Pasha is "+gender);
        System.out.println("===============================");

        long phoneNumber=shopDeal.getPhoneNumberByName("Deepa");
        System.out.println("Deepa's phone number is "+phoneNumber);
        System.out.println("===============================");

        long phoneNumber1=shopDeal.getPhoneNumberByName("Diya");
        System.out.println("Diya's phone number is "+phoneNumber1);
        System.out.println("===============================");

        boolean isEmailUpdated=shopDeal.updateEmailById(3,"chiranth@gmail.com");
        System.out.println("is email of chiranth updated: "+isEmailUpdated);
        System.out.println("===============================");


        boolean isOrderPlacedUpdated=shopDeal.updateIsOrderPlacedByName("Abhishek",false);
        System.out.println("is order placed by abhishek updated: "+isOrderPlacedUpdated);
        System.out.println("===============================");

       shopDeal.getAllCustomerDetails();

        boolean isCustomerDeleted=shopDeal.deleteCustomerById(2);
        System.out.println("is customer with id 2 deleted: "+isCustomerDeleted);
        System.out.println("===============================");

        String name3=shopDeal.getNameById(2);
        System.out.println("name: "+name3);
        System.out.println("===============================");

        shopDeal.getAllCustomerDetails();*/
    }
}
