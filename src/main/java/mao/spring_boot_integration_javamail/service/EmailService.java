package mao.spring_boot_integration_javamail.service;

import java.io.File;
import java.util.Map;

/**
 * Project name(项目名称)：spring_boot_integration_javaMail
 * Package(包名): mao.spring_boot_integration_javamail.service
 * Interface(接口名): EmailService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/11
 * Time(创建时间)： 13:07
 * Version(版本): 1.0
 * Description(描述)： 邮件发送接口
 */

public interface EmailService
{
    /**
     * 发送邮件
     *
     * @param sender       发送人的账户或者名称
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     */
    void sendEmail(String sender, String receiver, String emailSubject, String emailText);

    /**
     * 发送邮件，群发
     *
     * @param sender       发送人的账户或者名称
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     */
    void sendEmail(String sender, String[] receiver, String emailSubject, String emailText);

    /**
     * 发送邮件
     *
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     */
    void sendEmail(String receiver, String emailSubject, String emailText);

    /**
     * 发送邮件，群发
     *
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     */
    void sendEmail(String[] receiver, String emailSubject, String emailText);

    /**
     * 发送邮件，支持HTML页面和一个文件
     *
     * @param sender       发送人的账户或者名称
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     * @param fileName     文件名
     * @param file         java文件对象
     */
    void sendHTMLAndFileEmail(String sender, String receiver, String emailSubject, String emailText, String fileName, File file);

    /**
     * 发送邮件，支持HTML页面和一个文件，群发
     *
     * @param sender       发送人的账户或者名称
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     * @param fileName     文件名
     * @param file         java文件对象
     */
    void sendHTMLAndFileEmail(String sender, String[] receiver, String emailSubject, String emailText, String fileName, File file);

    /**
     * 发送邮件，支持HTML页面和一个文件，不需要指定发送人
     *
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     * @param fileName     文件名
     * @param file         java文件对象
     */
    void sendHTMLAndFileEmail(String receiver, String emailSubject, String emailText, String fileName, File file);

    /**
     * 发送邮件，支持HTML页面和一个文件，不需要指定发送人，群发
     *
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     * @param fileName     文件名
     * @param file         java文件对象
     */
    void sendHTMLAndFileEmail(String[] receiver, String emailSubject, String emailText, String fileName, File file);

    /**
     * 发送邮件，支持HTML页面和多个文件
     *
     * @param sender       发送人的账户或者名称
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     * @param fileMap      map集合，键是文件名，值是java文件对象
     */
    void sendHTMLAndFileEmail(String sender, String receiver, String emailSubject, String emailText, Map<String, File> fileMap);

    /**
     * 发送邮件，支持HTML页面和多个文件，群发
     *
     * @param sender       发送人的账户或者名称
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     * @param fileMap      map集合，键是文件名，值是java文件对象
     */
    void sendHTMLAndFileEmail(String sender, String[] receiver, String emailSubject, String emailText, Map<String, File> fileMap);

    /**
     * 发送邮件，支持HTML页面和多个文件，不需要指定发送人
     *
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     * @param fileMap      map集合，键是文件名，值是java文件对象
     */
    void sendHTMLAndFileEmail(String receiver, String emailSubject, String emailText, Map<String, File> fileMap);

    /**
     * 发送邮件，支持HTML页面和多个文件，不需要指定发送人，群发
     *
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     * @param fileMap      map集合，键是文件名，值是java文件对象
     */
    void sendHTMLAndFileEmail(String[] receiver, String emailSubject, String emailText, Map<String, File> fileMap);

    /**
     * 发送邮件，仅发送html页面，不发送文件
     *
     * @param sender       发送人的账户或者名称
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     */
    void sendHTMLEmail(String sender, String receiver, String emailSubject, String emailText);

    /**
     * 发送邮件，仅发送html页面，不发送文件，群发
     *
     * @param sender       发送人的账户或者名称
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     */
    void sendHTMLEmail(String sender, String[] receiver, String emailSubject, String emailText);

    /**
     * 发送邮件，仅发送html页面，不发送文件，不需要指定发送人
     *
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     */
    void sendHTMLEmail(String receiver, String emailSubject, String emailText);

    /**
     * 发送邮件，仅发送html页面，不发送文件，不需要指定发送人，群发
     *
     * @param receiver     接收人的账户
     * @param emailSubject 邮件的标题或者主题
     * @param emailText    邮件的正文
     */
    void sendHTMLEmail(String[] receiver, String emailSubject, String emailText);

}
