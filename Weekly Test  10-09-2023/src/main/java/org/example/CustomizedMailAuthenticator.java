package org.example;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CustomizedMailAuthenticator extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication("kuldeepaggarwal305@gmail.com", "osgbikjwsynrocjj");

    }
}
