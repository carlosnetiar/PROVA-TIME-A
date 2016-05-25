package br.com.siag.util;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class FEmail {
    
    public static boolean isCnpj(String cnpj){
        return (cnpj.trim().length() > 11);
    }
    
    public static boolean enviar(String nome, String email, String assunto, String corpo){
        boolean enviado = false;
        
        String emailRemetente = "nao-responda@fradetecnologia.com.br";
        String nomeRemetente = "FRADE Tecnologia";

        String protocolo = "smtp";
        String servidor = "smtp.gmail.com";  // do painel de controle do SMTP
        String username = "fradeneto"; // do painel de controle do SMTP
        String senha = "eHrluZqD7858"; // do painel de controle do SMTP
        String porta = "587";   // do painel de controle do SMTP
        
        
        Properties props = new Properties();
        props.put("mail.transport.protocol", protocolo);
        props.put("mail.smtp.host", servidor);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", porta);

        Session session = Session.getDefaultInstance(props, null);
        session.setDebug(false);

        try {
          InternetAddress iaFrom = new InternetAddress(emailRemetente, nomeRemetente);
          InternetAddress[] iaTo = new InternetAddress[1];
          InternetAddress[] iaReplyTo = new InternetAddress[1];

          iaReplyTo[0] = new InternetAddress(email, nome);
          iaTo[0] = new InternetAddress(email, nome);

          MimeMessage msg = new MimeMessage(session);

          if (iaReplyTo != null)
            msg.setReplyTo(iaReplyTo);
          if (iaFrom != null)
            msg.setFrom(iaFrom);
          if (iaTo.length > 0)
            msg.setRecipients(Message.RecipientType.TO, iaTo);
          msg.setSubject(assunto);
          msg.setSentDate(new Date());

          msg.setContent(corpo, "text/html");

          Transport tr = session.getTransport(protocolo);
          tr.connect(servidor, username, senha);

          msg.saveChanges();

          tr.sendMessage(msg, msg.getAllRecipients());
          tr.close();
          
          enviado = true;
        } catch (UnsupportedEncodingException e) {
          e.printStackTrace();
        } catch (MessagingException e) {
          e.printStackTrace();
        }
    
        return enviado;
    }
}
