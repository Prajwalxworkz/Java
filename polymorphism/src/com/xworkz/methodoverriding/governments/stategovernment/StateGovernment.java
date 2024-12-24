package com.xworkz.methodoverriding.governments.stategovernment;

import com.xworkz.methodoverriding.governments.government.Government;

public class StateGovernment extends Government {
   public static boolean isBplCardAvailable;

//    public boolean isBplCardAvailable() {
//        return isBplCardAvailable;
//    }
//
//    public void setBplCardAvailable(boolean bplCardAvailable) {
//        isBplCardAvailable = bplCardAvailable;
//    }

    @Override
    public void freeEducation(){
        System.out.println("invoked from state government class ");
        if(isBplCardAvailable==true){
            System.out.println("Free education for all students under the age of 15");
        }else {
            System.out.println("No free education");
        }

    }
}
