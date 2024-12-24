package com.xworkz.methodoverriding.governments;

import com.xworkz.methodoverriding.governments.centralgovernment.CentralGovernment;
import com.xworkz.methodoverriding.governments.government.Government;
import com.xworkz.methodoverriding.governments.stategovernment.StateGovernment;

public class GovernmentRunner {
    public static void main(String[] args) {
        Government government = new Government();
        government.freeEducation();
        government.setState("Karnataka");
        government.setNoOfMlas(224);
        government.setPartyHeadName("Congress");
        government.setHomeMinisterName("G Parameshwara");
        government.getGovernmentInfo();
        System.out.println("--------------------------------");

        Government government1 = new StateGovernment(); // Runtime-Polymorphism
        StateGovernment.isBplCardAvailable=true;
        government1.freeEducation();
        government1.setState("Karnataka");
        government1.setNoOfMlas(224);
        government1.setPartyHeadName("Congress");
        government1.setHomeMinisterName("G Parameshwara");
        government1.getGovernmentInfo();
        System.out.println("--------------------------------");
        StateGovernment government2 = new StateGovernment();
        StateGovernment.isBplCardAvailable=true;
        government2.freeEducation();
        government2.setState("Kerala");
        government2.setNoOfMlas(224);
        government2.setPartyHeadName("Congress");
        government2.setHomeMinisterName("G Parameshwara");
        government2.getGovernmentInfo();
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        Government government3 = new CentralGovernment();
        government3.freeEducation();
        government3.setState("Haryana");
        government3.setNoOfMlas(90);
        government3.setPartyHeadName("BJP");
        government3.setHomeMinisterName("Anil Vij");
        government3.getGovernmentInfo();
        System.out.println("----------------------------------");
        CentralGovernment government4 = new CentralGovernment();
        government4.freeEducation();
        government4.setState("Madhya Pradesh");
        government4.setNoOfMlas(90);
        government4.setPartyHeadName("BJP");
        government4.setHomeMinisterName("Anil Vij");
        government4.getGovernmentInfo();
    }
}
