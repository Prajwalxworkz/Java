package com.xworkz.ecommerseapp.customer;


import com.xworkz.ecommerseapp.constant.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private int id;
    private String name;
    private String dob;
    private int age;
    private String email;
    private Gender gender;
    private long phoneNumber;
    private boolean isOrderPlaced;
    @Override
    public String toString(){
        return "Customer-(id="+this.id+", name="+this.name+",dob="+this.dob+", age="+this.age+", email="+this.email+",gender="+this.gender+", phoneNumber="+this.phoneNumber+", isOrderPlaced="+this.isOrderPlaced+")";
    }
    @Override
    public int hashCode(){
        return this.id;
    }
    @Override
    public boolean equals(Object obj){
        Customer customer= (Customer) obj;
        if(this.hashCode()==customer.hashCode() && this.name==customer.name && this.dob==customer.dob && this.age==customer.age && this.gender==customer.gender && this.phoneNumber==customer.phoneNumber && this.isOrderPlaced==customer.isOrderPlaced)
            return true;
        return false;

    }
}

