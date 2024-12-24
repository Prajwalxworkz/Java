package com.google.gmailapp.gmail;

import com.google.gmailapp.mail.Mail;

public interface Email {
    public boolean saveMail(Mail compose);
    public void getAllMails();
    public Mail getMailById(int id);
    public Mail getMailByTo(String to);
    public Mail getMailByFrom(String from);
    public Mail getMailBySubject(String subject);
    public Mail getMailByBody(String body);
    public boolean updateSubjectById(int id, String updatedSubject);
    public boolean updateBodyById(int id, String updatedBody);
    public boolean updateBodyBySubject(String Subject, String updatedBody );
    public boolean deleteMailById(int id);
    public void displayDetails(Mail email);

}
