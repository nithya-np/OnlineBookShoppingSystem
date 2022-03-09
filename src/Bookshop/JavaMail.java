package Bookshop;

import java.util.*;
import java.util.logging.*;
import javax.mail.*;
import javax.mail.internet.*;

public class JavaMail {
    public static void sendMail(String to,String body) throws MessagingException{
        System.out.println("Preparing to send email");
        
        Properties properties=new Properties();
         
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        String from="nithima2001@gmail.com";
        String password="priya@1312";
        
        Session session=Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(from,password);
                
            }
        });
        
        Message message=prepareMessage(session,from,to,body); 
        Transport.send(message);
        System.out.println("Email send successfully");
    }

    private static Message prepareMessage(Session session,String from,String to,String body) throws MessagingException{
        try {
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Online Book Shopping System");
            message.setText(body);
            return message;
        } catch (AddressException ex) {
            Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    static void sendMail(String nithima2001gmailcom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}