package com.xworkz.medplus.medical;

import com.xworkz.medplus.drugs.Tablet;

public class Medical {
    Tablet tablet;
    public boolean addDrug(Tablet tablet){
        boolean isDrugAdded=false;
        if(tablet!=null){
            if(tablet.getId()>0 && tablet.getName()!=null){
                this.tablet=tablet;
            }
        }else{
            System.out.println("Tablet fields are empty");
        }
        return isDrugAdded;
    }
public void getDrugDetail(){
    System.out.println("id: "+tablet.getId());
    System.out.println("name: "+tablet.getName());
    System.out.println("manufacturing date: "+tablet.getMfd());
    System.out.println("expiry date: "+tablet.getExp());
    System.out.println("number of tablets: "+tablet.getNumOfTablets());
    System.out.println("price: "+tablet.getPrice());

}
}

