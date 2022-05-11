package mao.spring_boot_integration_javamail.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Map;

/**
 * Project name(项目名称)：spring_boot_integration_javaMail
 * Package(包名): mao.spring_boot_integration_javamail.service
 * Class(类名): EmailServiceImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/11
 * Time(创建时间)： 13:12
 * Version(版本): 1.0
 * Description(描述)： 实现类
 */

@Service
public class EmailServiceImpl implements EmailService
{

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;

    private static final Logger log = LoggerFactory.getLogger(EmailServiceImpl.class);

    @Override
    public void sendEmail(String sender, String receiver, String emailSubject, String emailText)
    {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(sender);
        simpleMailMessage.setTo(receiver);
        simpleMailMessage.setSubject(emailSubject);
        simpleMailMessage.setText(emailText);
        javaMailSender.send(simpleMailMessage);
        log.info("发送邮件给 " + receiver + " 成功，邮件标题：" + emailSubject);
    }

    @Override
    public void sendEmail(String sender, String[] receiver, String emailSubject, String emailText)
    {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(sender);
        simpleMailMessage.setTo(receiver);
        simpleMailMessage.setSubject(emailSubject);
        simpleMailMessage.setText(emailText);
        javaMailSender.send(simpleMailMessage);
        log.info("群发邮件成功，邮件标题：" + emailSubject);
    }

    @Override
    public void sendEmail(String receiver, String emailSubject, String emailText)
    {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(this.sender);
        simpleMailMessage.setTo(receiver);
        simpleMailMessage.setSubject(emailSubject);
        simpleMailMessage.setText(emailText);
        javaMailSender.send(simpleMailMessage);
        log.info("发送邮件给 " + receiver + " 成功，邮件标题：" + emailSubject);
    }

    @Override
    public void sendEmail(String[] receiver, String emailSubject, String emailText)
    {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(this.sender);
        simpleMailMessage.setTo(receiver);
        simpleMailMessage.setSubject(emailSubject);
        simpleMailMessage.setText(emailText);
        javaMailSender.send(simpleMailMessage);
        log.info("群发邮件成功，邮件标题：" + emailSubject);
    }

    @Override
    public void sendHTMLAndFileEmail(String sender, String receiver, String emailSubject, String emailText, String fileName, File file)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            mimeMessageHelper.addAttachment(fileName, file);
            javaMailSender.send(mimeMessage);
            log.info("发送包含附件的HTML邮件给 " + receiver + " 成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.warn("发送包含附件的HTML邮件给 " + receiver + " 失败！邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLAndFileEmail(String sender, String[] receiver, String emailSubject, String emailText, String fileName, File file)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            mimeMessageHelper.addAttachment(fileName, file);
            javaMailSender.send(mimeMessage);
            log.info("群发包含附件的HTML邮件成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.warn("发送包含附件的HTML邮件失败！邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLAndFileEmail(String receiver, String emailSubject, String emailText, String fileName, File file)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(this.sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            mimeMessageHelper.addAttachment(fileName, file);
            javaMailSender.send(mimeMessage);
            log.info("发送包含附件的HTML邮件给 " + receiver + " 成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.warn("发送包含附件的HTML邮件给 " + receiver + " 失败！邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLAndFileEmail(String[] receiver, String emailSubject, String emailText, String fileName, File file)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(this.sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            mimeMessageHelper.addAttachment(fileName, file);
            javaMailSender.send(mimeMessage);
            log.info("群发包含附件的HTML邮件成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.warn("发送包含附件的HTML邮件失败！邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLAndFileEmail(String sender, String receiver, String emailSubject, String emailText, Map<String, File> fileMap)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            for (String filename : fileMap.keySet())
            {
                mimeMessageHelper.addAttachment(filename, fileMap.get(filename));
            }
            javaMailSender.send(mimeMessage);
            log.info("发送包含附件的HTML邮件给 " + receiver + " 成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.warn("发送包含附件的HTML邮件给 " + receiver + " 失败！邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLAndFileEmail(String sender, String[] receiver, String emailSubject, String emailText, Map<String, File> fileMap)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            for (String filename : fileMap.keySet())
            {
                mimeMessageHelper.addAttachment(filename, fileMap.get(filename));
            }
            javaMailSender.send(mimeMessage);
            log.info("群发包含附件的HTML邮件成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.info("群发包含附件的HTML邮件成功，邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLAndFileEmail(String receiver, String emailSubject, String emailText, Map<String, File> fileMap)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(this.sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            for (String filename : fileMap.keySet())
            {
                mimeMessageHelper.addAttachment(filename, fileMap.get(filename));
            }
            javaMailSender.send(mimeMessage);
            log.info("发送包含附件的HTML邮件给 " + receiver + " 成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.warn("发送包含附件的HTML邮件给 " + receiver + " 失败！邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLAndFileEmail(String[] receiver, String emailSubject, String emailText, Map<String, File> fileMap)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(this.sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            for (String filename : fileMap.keySet())
            {
                mimeMessageHelper.addAttachment(filename, fileMap.get(filename));
            }
            javaMailSender.send(mimeMessage);
            log.info("群发包含附件的HTML邮件成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.info("群发包含附件的HTML邮件成功，邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLEmail(String sender, String receiver, String emailSubject, String emailText)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, false);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            javaMailSender.send(mimeMessage);
            log.info("发送HTML邮件给 " + receiver + " 成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.warn("发送HTML邮件给 " + receiver + " 失败！邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLEmail(String sender, String[] receiver, String emailSubject, String emailText)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, false);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            javaMailSender.send(mimeMessage);
            log.info("群发包含附件的HTML邮件成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.info("群发包含附件的HTML邮件成功，邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLEmail(String receiver, String emailSubject, String emailText)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, false);
            mimeMessageHelper.setFrom(this.sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            javaMailSender.send(mimeMessage);
            log.info("发送HTML邮件给 " + receiver + " 成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.warn("发送HTML邮件给 " + receiver + " 失败！邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }

    @Override
    public void sendHTMLEmail(String[] receiver, String emailSubject, String emailText)
    {
        try
        {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, false);
            mimeMessageHelper.setFrom(this.sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject(emailSubject);
            mimeMessageHelper.setText(emailText, true);
            javaMailSender.send(mimeMessage);
            log.info("群发包含附件的HTML邮件成功，邮件标题：" + emailSubject);
        }
        catch (MessagingException e)
        {
            log.info("群发包含附件的HTML邮件成功，邮件标题：" + emailSubject);
            e.printStackTrace();
        }
    }
}
