package com.xworkz.medplus.drugs;

import com.sun.xml.internal.ws.assembler.jaxws.TerminalTubeFactory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Tablet {
    private int id;
    private String name;
    private String mfd;
    private String exp;
    private double price;
    private int numOfTablets;

    @Override
    public String toString(){
        return "Tablet-(id="+this.id+", name="+this.name+", mfd="+this.mfd+", exp="+this.exp+", price="+this.price+", numOfTablets="+this.numOfTablets+")";
    }
    @Override
    public int hashCode(){
        return this.id;
    }


    @Override
    public boolean equals(Object obj){
        Tablet tablet=(Tablet) obj;
        if(this.name.equals(tablet.name) && this.hashCode()==tablet.hashCode() && mfd.equals(tablet.mfd) && exp.equals(tablet.exp) && price==tablet.price && numOfTablets==tablet.numOfTablets)
            return true;
        return false;
    }

}
