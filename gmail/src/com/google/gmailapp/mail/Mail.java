package com.google.gmailapp.mail;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Mail {
    private int id;
    private String to;
    private String from;
    private String subject;
    private String body;
    private boolean isDocAttached;

//    @Override
//    public String toString() {
//      return "Mail-(id= " +this.id+", to= "+this.to+", from= "+this.from+", subject= "+this.subject+", body= "+this.body+", isDocAttached= "+this.isDocAttached+")";
//    }
}
