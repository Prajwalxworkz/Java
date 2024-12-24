package com.google.gmailapp.gmail;

import com.google.gmailapp.exception.*;
import com.google.gmailapp.mail.Mail;

import java.util.Arrays;

public class Gmail implements Email{
    Mail compose[] =null;
    int index;
public Gmail(int size){
    compose = new Mail[size];
}
    public boolean saveMail(Mail compose) {
        boolean isMailComposed = false;
        if (this.compose.length > index) {
            if (compose != null) {
                if (compose.getId() > 0 && compose.getTo() != null && compose.getFrom() != null && compose.getSubject()!=null && compose.getBody() != null && compose.isDocAttached()) {
                    this.compose[index++] = compose;
                    isMailComposed = true;

                } else {
                    System.out.println("fields are incorrect");
                }
            } else {
                System.out.println("Saved as draft");
            }
        } else {
            System.out.println("Memory is full");
        }
        return isMailComposed;
    }

    public void getAllMails(){
        if(compose!=null){
            for (Mail inbox:compose){
                System.out.println(inbox);
            }
        }else {
         System.out.println("Mail is empty");
        }

    }

    public Mail getMailById(int id){
        Mail mailToBeReturned=null;
        try {
            for (Mail mail : compose) {
                if (mail.getId() == id) {
                    mailToBeReturned = mail;
                }
            }
            if (mailToBeReturned == null)
            {
                MailNotFoundByIdException mailNotFoundByIdException=new MailNotFoundByIdException("Mentioned id "+id+" is not found");
                throw mailNotFoundByIdException;
            }
        }catch (MailNotFoundByIdException e){
            e.printStackTrace();
        }
        return  mailToBeReturned;
    }

    public Mail getMailByTo(String to){
        Mail mailToBeReturned=null;
        try {
            for (Mail mail : compose) {
                if (mail.getTo().equals(to)) {
                    mailToBeReturned = mail;
                }
            }
            if (mailToBeReturned == null)
            {
                MailNotFoundByToException mailNotFoundByToException=new MailNotFoundByToException("Mentioned receiver "+to+" is not found");
                throw mailNotFoundByToException;
            }
        }catch (MailNotFoundByToException e){
            e.printStackTrace();
        }
        return  mailToBeReturned;
    }

    public Mail getMailByFrom(String from){
        Mail mailToBeReturned=null;
        try {
            for (Mail mail : compose) {
                if (mail.getFrom().equals(from)) {
                    mailToBeReturned = mail;
                }
            }
            if (mailToBeReturned == null)
            {
                MailNotFoundByFromException mailNotFoundByFromException=new MailNotFoundByFromException("Mentioned sender" +from+" is not found");
                throw mailNotFoundByFromException;
            }
        }catch (MailNotFoundByFromException e){
            e.printStackTrace();
        }
        return  mailToBeReturned;
    }

    public Mail getMailBySubject(String subject){
        Mail mailToBeReturned=null;
        try {
            for (Mail mail : compose) {
                if (mail.getSubject().equals(subject)) {
                    mailToBeReturned = mail;
                }
            }
            if (mailToBeReturned == null)
            {
                MailNotFoundBySubjectException mailNotFoundBySubjectException=new MailNotFoundBySubjectException("Mentioned subject "+subject+" is not found");
                throw mailNotFoundBySubjectException;
            }
        }catch (MailNotFoundBySubjectException e){
            e.printStackTrace();
        }
        return  mailToBeReturned;
    }

    public Mail getMailByBody(String body){
        Mail mailToBeReturned=null;
        try {
            for (Mail mail : compose) {
                if (mail.getBody().equals(body)) {
                    mailToBeReturned = mail;
                }
            }
            if (mailToBeReturned == null)
            {
                MailNotFoundByBodyException mailNotFoundByBodyException=new MailNotFoundByBodyException("Mentioned body "+body+" is not found");
                throw mailNotFoundByBodyException;
            }
        }catch (MailNotFoundByBodyException e){
            e.printStackTrace();
        }
        return  mailToBeReturned;
    }

    public  boolean updateSubjectById(int id, String updatedSubject){
        boolean isSubjectUpdated=false;
        try {
            for (Mail mail : compose) {
                if (mail.getId() == id) {
                    mail.setSubject(updatedSubject);
                    isSubjectUpdated = true;
                    break;
                }
            }
            if (!isSubjectUpdated)
            {
                IdNotFoundToUpdateSubjectException idNotFoundToUpdateSubjectException=new IdNotFoundToUpdateSubjectException("Mentioned id "+id+" is not found");
                throw idNotFoundToUpdateSubjectException;
            }
        }catch (IdNotFoundToUpdateSubjectException e){
            e.printStackTrace();
        }
        return  isSubjectUpdated;
    }

    @Override
    public boolean updateBodyById(int id, String updatedBody) {
    boolean isBodyUpdated=false;
    try {
        for (Mail mail : compose) {
            if (mail.getId() == id) {
                mail.setBody(updatedBody);
                isBodyUpdated = true;
            }
        }
        if (isBodyUpdated == false)
        {
            IdNotFoundToUpdateBodyException idNotFoundToUpdateBodyException=new IdNotFoundToUpdateBodyException("Mentioned id "+id+" is not found");
            throw idNotFoundToUpdateBodyException;
        }
    }catch (IdNotFoundToUpdateBodyException e){
        e.printStackTrace();
    }
        return isBodyUpdated;
    }

    @Override
    public boolean updateBodyBySubject(String subject, String updatedBody) {
        boolean isBodyUpdated=false;
        try {
            for (Mail mail : compose) {
                if (mail.getSubject().equals(subject)) {
                    mail.setBody(updatedBody);
                    isBodyUpdated = true;
                }
            }
            if (isBodyUpdated == false)

            {
                SubjectNotFoundToUpdateBodyException subjectNotFoundToUpdateBodyException=new SubjectNotFoundToUpdateBodyException("Mentioned subject "+subject+" is not found");
                throw subjectNotFoundToUpdateBodyException;
            }
        }catch (SubjectNotFoundToUpdateBodyException e){
            e.printStackTrace();
        }
        return isBodyUpdated;
    }

    public boolean deleteMailById(int id){
        boolean isMailDeleted=false;
        int start, initial;
        try {
            for (start = 0, initial = 0; start < compose.length; start++) {
                if (compose[start].getId() != id) {
                    compose[initial++] = compose[start];
                } else
                    isMailDeleted = true;
            }
            if (!isMailDeleted)
            {
                IdNotFoundToDeleteMailException idNotFoundToDeleteMailException=new IdNotFoundToDeleteMailException("Mentioned id "+id+" is not found");
                throw idNotFoundToDeleteMailException;
            }
            compose = Arrays.copyOf(compose, initial);
        }catch (IdNotFoundToDeleteMailException e){
            e.printStackTrace();
        }
        return  isMailDeleted;
    }

    public void displayDetails(Mail mail){
        if(mail!= null){
            System.out.println("mail details through specific field");
            System.out.println("---------------");
            System.out.println("mail id: "+mail.getId());
            System.out.println("to: "+mail.getTo());
            System.out.println("from: "+mail.getFrom());
            System.out.println("subject: "+mail.getSubject());
            System.out.println("body: "+mail.getBody());
            System.out.println("is document added: "+mail.isDocAttached());
            System.out.println("===================================");
        }else{
            System.out.println("Nothing to display");
            System.out.println("===================================");
        }
    }

    /*public void getMailById(int id) {
        boolean isIdFound = false;
        for(int start=0;start < this.compose.length;start++) {

            if (id!=compose[start].getId()) {
                continue;
            }else {
                isIdFound=true;
                System.out.println("**********************************");
                System.out.println("Values based on id "+id+" are: ");
                System.out.println("to: " + compose[start].getTo());
                System.out.println("from: " + compose[start].getFrom());
                System.out.println("subject: " + compose[start].getSubject());
                System.out.println("body: " + compose[start].getBody());
                System.out.println("is document added " + compose[start].isDocAttached());

                System.out.println("**********************************");
            }
        }
        if (isIdFound==false) {
            System.out.println("No such id found");
        }
    }*/
}
