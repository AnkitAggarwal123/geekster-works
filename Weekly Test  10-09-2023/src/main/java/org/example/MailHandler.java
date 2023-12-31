package org.example;

import org.springframework.context.annotation.Configuration;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailHandler {

    public static void sendMail(String carName)
    {


        //properties

        //something like a map
        Properties sysPropertiesMap = System.getProperties();

        //System.out.println(sysPropertiesMap);

        //in this map I want to add 4 more key value pairs : mailing

        sysPropertiesMap.put("mail.smtp.host","smtp.gmail.com"); //smtp server
        sysPropertiesMap.put("mail.smtp.port","465"); //server port
        sysPropertiesMap.put("mail.smtp.ssl.enable","true"); //ssl -secure socket layer
        sysPropertiesMap.put("mail.smtp.auth","true"); //authentication - auth


        //authentication

        Authenticator mailAuthenticator = new CustomizedMailAuthenticator();


        //session
        Session mailSession = Session.getInstance(sysPropertiesMap,mailAuthenticator);


        //build the mail
        //Mime message

        MimeMessage mailMessage = new MimeMessage(mailSession);

        try {
            mailMessage.setFrom("kuldeepaggarwal305@gmailcom");
            mailMessage.setSubject("Geekster Test");
            mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress("kuldeepaggarwal305@gmail.com"));
            mailMessage.setText(carName);

            Transport.send(mailMessage);

        }
        catch(Exception ex)
        {
            System.out.println("Some error while preparing mail body");
            System.out.println(ex.getMessage());
        }






    }


}
