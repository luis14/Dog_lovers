/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;


/**
 *
 * @author Santiago
 */
public class EnviadorEmail {
    final String miCorreo = "tec.email.poo@gmail.com";
    final String miContrasena = "alejandria1";
    final String servidorSMTP = "smtp.gmail.com";
    final String puertoEnvio = "465";
    String mailReceptor = null;
    String asunto = null;
    String cuerpo = null;
    
    //EnviadorEmail EnviadorMail = new EnviadorEmail("Correo a mandar","Nombre de la persona");

    public EnviadorEmail(String mailReceptor, String persona) {
        this.mailReceptor = mailReceptor;
        this.asunto = "Prueba cosita.";
        this.cuerpo = ("Hola " + persona + "\n" + 
            	"Que tal?" + "\n-\n" + "Proyecto POO, para una vida mejor :)");

        Properties props = new Properties();
        props.put("mail.smtp.user", miCorreo);
        props.put("mail.smtp.host", servidorSMTP);
        props.put("mail.smtp.port", puertoEnvio);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", puertoEnvio);
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        SecurityManager security = System.getSecurityManager();

        try {
            Authenticator auth = new autentificadorSMTP();
            Session session = Session.getInstance(props, auth);
            // session.setDebug(true);

            MimeMessage msg = new MimeMessage(session);
            msg.setText(cuerpo);
            msg.setSubject(asunto);
            msg.setFrom(new InternetAddress(miCorreo));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(
                    mailReceptor));
            Transport.send(msg);
        } catch (Exception mex) {
            mex.printStackTrace();
        }

    }

    private class autentificadorSMTP extends javax.mail.Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(miCorreo, miContrasena);
        }
    }

    /**
     * @param args
     */
   /* public static void main(String[] args) {
        // TODO Auto-generated method stub
        EnviadorMail EnviadorMail = new EnviadorMail("santiago1096@gmail.com",
                "Este es el asunto de mi correo", "Este es el cuerpo de mi correo");
    }*/
}