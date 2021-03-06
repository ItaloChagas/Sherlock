package br.com.techsow.sherlock.control.web;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.techsow.sherlock.model.entities.Usuario;

public class EmailSender {
	final String from = "technology.sow@gmail.com";
	final String username = "technology.sow@gmail.com";
	final String password = "fiap2019";
	final String host = "smtp.gmail.com";

	private int code;

	public EmailSender(int code) {
		this.code = code;

	}

	public void enviarEmail(Usuario usuario) {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(usuario.getEmail()));

			// Set Subject: header field
			message.setSubject("recuperação de senha");
			message.setContent(
					"<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Strict//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd'><html data-editor-version='2' class='sg-campaigns' xmlns='http://www.w3.org/1999/xhtml'> <head> <meta http-equiv='Content-Type' content='text/html; charset=utf-8'/> <meta name='viewport' content='width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1'/> <meta http-equiv='X-UA-Compatible' content='IE=Edge'/><!--[if (gte mso 9)|(IE)]> <xml> <o:OfficeDocumentSettings> <o:AllowPNG/> <o:PixelsPerInch>96</o:PixelsPerInch> </o:OfficeDocumentSettings> </xml><![endif]--><!--[if (gte mso 9)|(IE)]> <style type='text/css'> body{width: 600px;margin: 0 auto;}table{border-collapse: collapse;}table, td{mso-table-lspace: 0pt;mso-table-rspace: 0pt;}img{-ms-interpolation-mode: bicubic;}</style><![endif]--> <style type='text/css'> body, p, div{font-family: helvetica,arial,sans-serif; font-size: 18px;}body{color: #ffffff;}body a{color: #e4570f; text-decoration: none;}p{margin: 0; padding: 0;}table.wrapper{width:100% !important; table-layout: fixed; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: 100%; -moz-text-size-adjust: 100%; -ms-text-size-adjust: 100%;}img.max-width{max-width: 100% !important;}.column.of-2{width: 50%;}.column.of-3{width: 33.333%;}.column.of-4{width: 25%;}@media screen and (max-width:480px){.preheader .rightColumnContent, .footer .rightColumnContent{text-align: left !important;}.preheader .rightColumnContent div, .preheader .rightColumnContent span, .footer .rightColumnContent div, .footer .rightColumnContent span{text-align: left !important;}.preheader .rightColumnContent, .preheader .leftColumnContent{font-size: 80% !important; padding: 5px 0;}table.wrapper-mobile{width: 100% !important; table-layout: fixed;}img.max-width{height: auto !important; max-width: 480px !important;}a.bulletproof-button{display: block !important; width: auto !important; font-size: 80%; padding-left: 0 !important; padding-right: 0 !important;}.columns{width: 100% !important;}.column{display: block !important; width: 100% !important; padding-left: 0 !important; padding-right: 0 !important; margin-left: 0 !important; margin-right: 0 !important;}}</style> </head> <body> <center class='wrapper' data-link-color='#e4570f' data-body-style='font-size: 18px; font-family: helvetica,arial,sans-serif; color: #ffffff; background-color: #c3c3c3;'> <div class='webkit'> <table cellpadding='0' cellspacing='0' border='0' width='100%' class='wrapper' bgcolor='#c3c3c3'> <tr> <td valign='top' bgcolor='#c3c3c3' width='100%'> <table width='100%' role='content-container' class='outer' align='center' cellpadding='0' cellspacing='0' border='0'> <tr> <td width='100%'> <table width='100%' cellpadding='0' cellspacing='0' border='0'> <tr> <td><!--[if mso]> <center> <table><tr><td width='600'><![endif]--> <table width='100%' cellpadding='0' cellspacing='0' border='0' style='width: 100%; max-width:600px;' align='center'> <tr> <td role='modules-container' style='padding: 0px 0px 0px 0px; color: #ffffff; text-align: left;' bgcolor='#ffffff' width='100%' align='left'> <table class='module preheader preheader-hide' role='module' data-type='preheader' border='0' cellpadding='0' cellspacing='0' width='100%' style='display: none !important; mso-hide: all; visibility: hidden; opacity: 0; color: transparent; height: 0; width: 0;'> <tr> <td role='module-content'> <p>recuperação de senha</p></td></tr></table> <table class='wrapper' role='module' data-type='image' border='0' cellpadding='0' cellspacing='0' width='100%' style='table-layout: fixed;'> <tr> <td style='font-size:6px;line-height:10px;padding:0px 0px 0px 0px;' valign='top' align='center'> <img class='max-width' border='0' style='display:block;color:#000000;text-decoration:none;font-family:Helvetica, arial, sans-serif;font-size:16px;max-width:100% !important;width:100%;height:auto !important;' src='https://marketing-image-production.s3.amazonaws.com/uploads/da93441a4764e786a292bdff51f305caad215afb0e7c1eb3f4d8eb9ed41b47703d47409ad445602f1e8a1ee9b4a20c229d25ea0a974b2f784d219f1a44e2d879.jpg' alt='' width='600'> </td></tr></table> <table class='module' role='module' data-type='text' border='0' cellpadding='0' cellspacing='0' width='100%' style='table-layout: fixed;'> <tr> <td style='background-color:#000000;padding:18px 18px 18px 17px;line-height:22px;text-align:justify;' height='100%' valign='top' bgcolor='#000000'> <div style='color: #fff;'>Você acaba de solicitar a recuperação de senha da techsow e aqui está seu código</div></td></tr></table> <table class='module' role='module' data-type='text' border='0' cellpadding='0' cellspacing='0' width='100%' style='table-layout: fixed;'> <tr> <td style='background-color:#000000;padding:18px 18px 18px 17px;line-height:22px;text-align:justify;' height='100%' valign='top' bgcolor='#000000'> <div style='color: #fff;font-size:20px;text-align:center;'>" + code + "</div></td></tr></table> <div data-role='module-unsubscribe' class='module unsubscribe-css__unsubscribe___2CDlR' role='module' data-type='unsubscribe' style='color:#444444;font-size:12px;line-height:20px;padding:16px 16px 16px 16px;text-align:center'><div class='Unsubscribe--addressLine'><p class='Unsubscribe--senderName' style='font-family:Arial, Helvetica, sans-serif;font-size:12px;line-height:20px'>[Sender_Name]</p><p style='font-family:Arial, Helvetica, sans-serif;font-size:12px;line-height:20px'><span class='Unsubscribe--senderAddress'>[Sender_Address]</span>, <span class='Unsubscribe--senderCity'>[Sender_City]</span>, <span class='Unsubscribe--senderState'>[Sender_State]</span> <span class='Unsubscribe--senderZip'>[Sender_Zip]</span> </p></div><p style='font-family:Arial, Helvetica, sans-serif;font-size:12px;line-height:20px'><a class='Unsubscribe--unsubscribeLink' href='<%asm_group_unsubscribe_raw_url%>'>Unsubscribe</a> - <a class='Unsubscribe--unsubscribePreferences' href='<%asm_preferences_raw_url%>'>Unsubscribe Preferences</a></p></div></td></tr></table><!--[if mso]> </td></tr></table> </center><![endif]--> </td></tr></table> </td></tr></table> </td></tr></table> </div></center> </body></html>"
					,"text/html");

			Transport.send(message);
			System.out.println("e-mail com codigo " + code + " mensagem enviada");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
