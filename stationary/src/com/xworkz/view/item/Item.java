package com.xworkz.view.item;

import com.sun.prism.shader.DrawEllipse_LinearGradient_REFLECT_AlphaTest_Loader;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class Item {
    private int id;
    private double price;
    private String type;
    private String name;
@Override
    public String toString(){
    return "Item(id="+this.id+", price="+this.price+", type="+this.type+", name="+this.name+")";
}
@Override
    public int hashCode(){
    return this.id;
}

    @Override
    public boolean equals(Object o) {
        Item item = (Item) o;
        if( this.hashCode() == item.hashCode() && Double.compare(price, item.price) == 0 && Objects.equals(type, item.type) && Objects.equals(name, item.name))
            return true;
        return false;
    }
}
