package com.google.gmailapp;

import com.google.gmailapp.gmail.Gmail;
import com.google.gmailapp.mail.Mail;

import java.util.Scanner;

public class GmailRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of mails to be created:");
        int size=s.nextInt();
        Gmail gmail= new Gmail(size);
        for(int i = 0; i<size; i++) {
            Mail mail = new Mail();
            System.out.println("Enter the id");
            int id = s.nextInt();
            mail.setId(id);
            System.out.println("Enter the sender");
            s.nextLine();
            String sender = s.nextLine();
            mail.setFrom(sender);
            System.out.println("Enter the receiver");
            s.nextLine();
            String receiver = s.nextLine();
            mail.setTo(receiver);
            System.out.println("Enter the subject");
            s.nextLine();
            String subject = s.nextLine();
            mail.setSubject(subject);
            System.out.println("Enter the body");
            s.nextLine();
            String body = s.nextLine();
            mail.setBody(body);
            System.out.println("is document attached? : ");
            boolean isDocAttached = s.nextBoolean();
            mail.setDocAttached(isDocAttached);
            gmail.saveMail(mail);
        }
       // gmail.getAllMails();
        String input=null;
        do{
            System.out.println("Press 1 to view all mail details");
            System.out.println("Press 2 to view specific  mail details based on id");
            System.out.println("Press 3 to view specific  mail details based on to");
            System.out.println("Press 4 to view specific  mail details based on from");
            System.out.println("Press 5 to view specific  mail details based on subject");
            System.out.println("Press 6 to view specific  mail details based on body");
            System.out.println("Press 7 to update subject based on id");
            System.out.println("Press 8 to update body based on id");
            System.out.println("Press 9 to update body based on subject");
            System.out.println("Press 10 to delete the mail based on id");
            int option=s.nextInt();
            switch(option){
                case 1:
                   gmail.getAllMails();
                   break;
                case 2:
                    System.out.println("Enter the id:");
                    Mail returnedMailById=gmail.getMailById(s.nextInt());
                    gmail.displayDetails(returnedMailById);
                    break;
                case 3:
                    System.out.println("Enter the sender's name: ");
                    s.nextLine();
                    Mail returnedMailByTo=gmail.getMailByTo(s.nextLine());
                    gmail.displayDetails(returnedMailByTo);
                    break;
                case 4:
                    System.out.println("Enter the receiver's name: ");
                    s.nextLine();
                    Mail returnedMailByFrom=gmail.getMailByFrom(s.nextLine());
                    gmail.displayDetails(returnedMailByFrom);
                    break;
                case 5:
                    System.out.println("Enter the subject: ");
                    s.nextLine();
                    Mail returnedMailBySubject=gmail.getMailBySubject(s.nextLine());
                    gmail.displayDetails(returnedMailBySubject);
                    break;
                case 6:
                    System.out.println("Enter the body: ");
                    s.nextLine();
                    Mail returnedMailByBody=gmail.getMailByBody(s.nextLine());
                    gmail.displayDetails(returnedMailByBody);
                    break;
                case 7:
                    System.out.println("Enter the id : ");
                    int id=s.nextInt();
                    System.out.println("Enter the  updated subject");
                    s.nextLine();
                    String updatedSubject=s.nextLine();
                    boolean updatedMailById=gmail.updateSubjectById(id, updatedSubject);
                    System.out.println("Is mail updated: "+updatedMailById);
                    break;
                case 8:
                    System.out.println("Enter the id : ");
                    int id1=s.nextInt();
                    System.out.println("Enter the  updated body");
                    s.nextLine();
                    String updatedBody=s.nextLine();
                    boolean updatedMailBodyById=gmail.updateBodyById(id1, updatedBody);
                    System.out.println("Is mail updated: "+updatedMailBodyById);
                    break;
                 case 9:
                    System.out.println("Enter the subject : ");
                    String Subject=s.next();
                    System.out.println("Enter the  updated body");
                    s.nextLine();
                    String updatedBody1=s.nextLine();
                    boolean updatedMailBodyBySubject=gmail.updateBodyBySubject(Subject, updatedBody1);
                    System.out.println("Is mail updated: "+updatedMailBodyBySubject);
                    break;
                case 10:
                    System.out.println("Enter the id: ");
                    boolean isMailDeleted= gmail.deleteMailById(s.nextInt());
                    System.out.println("Is mail deleted: "+isMailDeleted);
                    break;
                default:
                    System.out.println("Enter the valid option");
        }
            System.out.println("Do you want to continue? Yes/No ");
            input=s.next();
        }while(input.equalsIgnoreCase("Yes"));

        System.out.println("Thank you for co-operating...");
        System.out.println("Main ended");
/*
        Gmail gmail = new Gmail();
        boolean isMailAdded=gmail.saveMail(mail);
        System.out.println("is mail composed: "+isMailAdded);
        System.out.println("==============================");

        Mail mail1 = new Mail();
        mail1.setId(102);
        mail1.setFrom("sumanth@gmail.com");
        mail1.setTo("kruthik@gmail.com");
        mail1.setSubject("weekend trip ");
        mail1.setBody("To Mangaluru by car");
        mail1.setDocAttached(true);

        boolean isMailAdded1=gmail.saveMail(mail1);
        System.out.println("is mail composed: "+isMailAdded1);
        System.out.println("==============================");

        Mail mail2 = new Mail();
        mail2.setId(103);
        mail2.setFrom("sanjay@gmail.com");
        mail2.setTo("prajwal@gmail.com");
        mail2.setSubject("leave ");
        mail2.setBody("exam to attend  ");
        mail2.setDocAttached(true);

        boolean isMailAdded2=gmail.saveMail(mail2);
        System.out.println("is mail composed: "+isMailAdded2);
        System.out.println("==============================");

        Mail mail3 = new Mail();
        mail3.setId(104);
        mail3.setFrom("yakshith@gmail.com");
        mail3.setTo("kruthik@gmail.com");
        mail3.setSubject(" Finance");
        mail3.setBody("ppt is attached for reference");
        mail3.setDocAttached(true);

        boolean isMailAdded3=gmail.saveMail(mail3);
        System.out.println("is mail composed: "+isMailAdded3);
        System.out.println("==============================");

        Mail mail4 = new Mail();
        mail4.setId(105);
        mail4.setFrom("sudeesh@gmail.com");
        mail4.setTo("bilvesh@gmail.com");
        mail4.setSubject("assignment");
        mail4.setBody("files attached");
        mail4.setDocAttached(true);

        boolean isMailAdded4=gmail.saveMail(mail4);
        System.out.println("is mail composed: "+isMailAdded4);
        System.out.println("==============================");

        Mail mail5 = new Mail();
        mail5.setId(106);
        mail5.setFrom("kiran@gmail.com");
        mail5.setTo("sudeesh@gmail.com");
        mail5.setSubject("project");
        mail5.setBody("time table");
        mail5.setDocAttached(true);

        boolean isMailAdded5=gmail.saveMail(mail5);
        System.out.println("is mail composed: "+isMailAdded5);
        System.out.println("==============================");

        Mail mail6 = new Mail();
        mail6.setId(107);
        mail6.setFrom("sanjay@gmail.com");
        mail6.setTo("kruthik@gmail.com");
        mail6.setSubject("bike");
        mail6.setBody("activa 6g");
        mail6.setDocAttached(true);

        boolean isMailAdded6=gmail.saveMail(mail6);
        System.out.println("is mail composed: "+isMailAdded6);
        System.out.println("==============================");

        Mail mail7 = new Mail();
        mail7.setId(108);
        mail7.setFrom("yakshith@gmail.com");
        mail7.setTo("shreyas@gmail.com");
        mail7.setSubject("video");
        mail7.setBody("dance video");
        mail7.setDocAttached(true);

        boolean isMailAdded7=gmail.saveMail(mail7);
        System.out.println("is mail composed: "+isMailAdded7);
        System.out.println("==============================");
        gmail.getAllMails();

        Mail returnedMail=gmail.getMailById(102);
        gmail.displayDetails(returnedMail);
      //  System.out.println("********************************");


        Mail returnedMail1=gmail.getMailByTo("prajwal@gmail.com");
        gmail.displayDetails(returnedMail1);
      //  System.out.println("********************************");


        Mail returnedMail2=gmail.getMailByFrom("sanjay@gmail.com");
        gmail.displayDetails(returnedMail2);
//System.out.println("********************************");


        Mail returnedMail3=gmail.getMailBySubject("Money");
        gmail.displayDetails(returnedMail3);
      //  System.out.println("********************************");


        Mail returnedMail4=gmail.getMailByBody("activa 6g");
        gmail.displayDetails(returnedMail4);
      //  System.out.println("********************************");

        boolean isSubjectUpdated=gmail.updateSubjectById(101,"Assignments");
        System.out.println("is subject updated: "+isSubjectUpdated);
        System.out.println("********************************");

        boolean isMailDeleted=gmail.deleteMailById(101);
        System.out.println("is mail deleted: "+isMailDeleted);
        System.out.println("********************************");

        gmail.getAllMails();

 */
    }
}
