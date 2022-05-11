package mao.spring_boot_integration_javamail.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_integration_javaMail
 * Package(包名): mao.spring_boot_integration_javamail.service
 * Class(测试类名): EmailServiceTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/11
 * Time(创建时间)： 13:16
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class EmailServiceTest
{
    @Autowired
    private EmailService emailService;

    @Test
    void sendEmail()
    {
        emailService.sendEmail("", "",
                "java邮件API测试", "你好，世界。hello world");
    }

    @Test
    void sendEmail1()
    {
        emailService.sendEmail("",
                "java邮件API测试", "你好，世界。hello world");
    }

    @Test
    void sendHTMLEmail()
    {
        String photo = "<img src=\"https://i0.hdslb.com/bfs/archive/5f2762fb266c106c2a02024e4dcdf5b166d66524.jpg@672w_378h_1c\" alt=\"图片\">";
        emailService.sendHTMLEmail("",
                "java邮件API测试",
                "HTML页面测试，你好，世界。hello world，链接：<a href=\"https://www.bilibili.com/\">b站</a><br><br>图片：" + photo);
    }

    @Test
    void sendHTMLEmail2()
    {
        String photo = "<img src=\"https://i0.hdslb.com/bfs/archive/5f2762fb266c106c2a02024e4dcdf5b166d66524.jpg@672w_378h_1c\" alt=\"图片\">";

        String photo2 = "<img src=\"https://i1.hdslb.com/bfs/archive/41f6c69130a3159cb17df861e41d92b1a82e6186.png@672w_378h_1c.webp\" alt=\"图片\">";


        String photo3 = "<img src=\"https://i2.hdslb.com/bfs/archive/4a5654d75ae4731fe5ccf4108c3e191fc64fc1a3.jpg@672w_378h_1c\" alt=\"图片\">";
        String photo4 = "<img src=\"https://i1.hdslb.com/bfs/archive/a78afc181bb51d26ba76fb56db6fde46b19f52bc.jpg@672w_378h_1c.webp\" alt=\"图片\">";


        emailService.sendHTMLEmail("(隔壁老王)", "",
                "java邮件API测试",
                "HTML页面测试，你好，世界。hello world，链接：<a href=\"https://www.bilibili.com/\">b站</a><br><br>图片：" + photo + "<br><br>" + photo2 + "<br><br>" + photo3 + "<br><br>" + photo4);
    }


    @Test
    void sendHTMLEmail3()
    {
        String photo = "<img src=\"https://i0.hdslb.com/bfs/archive/5f2762fb266c106c2a02024e4dcdf5b166d66524.jpg@672w_378h_1c\" alt=\"图片\">";

        String photo2 = "<img src=\"https://i1.hdslb.com/bfs/archive/41f6c69130a3159cb17df861e41d92b1a82e6186.png@672w_378h_1c.webp\" alt=\"图片\">";


        String photo3 = "<img src=\"https://i2.hdslb.com/bfs/archive/4a5654d75ae4731fe5ccf4108c3e191fc64fc1a3.jpg@672w_378h_1c\" alt=\"图片\">";
        String photo4 = "<img src=\"https://i1.hdslb.com/bfs/archive/a78afc181bb51d26ba76fb56db6fde46b19f52bc.jpg@672w_378h_1c.webp\" alt=\"图片\">";


        emailService.sendHTMLEmail("(隔壁老王)", "",
                "java邮件API测试",
                "HTML页面测试，你好，世界。hello world，链接：<a href=\"https://www.bilibili.com/\">b站</a><br><br>图片："
                        + photo + "<br><br>" + photo2 + "<br><br>" + photo3 + "<br><br>" + photo4
                        + "<br><br><br>页面：" +
                        "<style>\n" +
                        "    body {\n" +
                        "        margin: 0;\n" +
                        "        height: 100vh;\n" +
                        "        display: flex;\n" +
                        "        align-items: center;\n" +
                        "        justify-content: center;\n" +
                        "        background-color: rgb(20%, 20%, 20%);\n" +
                        "    }\n" +
                        "\n" +
                        "    a {\n" +
                        "        text-decoration: none;\n" +
                        "    }\n" +
                        "\n" +
                        "    .warning {\n" +
                        "        color: whitesmoke;\n" +
                        "        font-size: 80px;\n" +
                        "        font-family: sans-serif;\n" +
                        "        font-weight: bold;\n" +
                        "        position: relative;\n" +
                        "        padding: 0.6em 0.4em;\n" +
                        "    }\n" +
                        "\n" +
                        "    .warning::before,\n" +
                        "    .warning::after {\n" +
                        "        content: '';\n" +
                        "        position: absolute;\n" +
                        "        top: 0;\n" +
                        "        left: 0;\n" +
                        "        width: 100%;\n" +
                        "        height: 100%;\n" +
                        "        border: 0.2em solid transparent;\n" +
                        "        box-sizing: border-box;\n" +
                        "        color: orangered;\n" +
                        "        animation: rotating 10s infinite;\n" +
                        "    }\n" +
                        "\n" +
                        "    .warning::before {\n" +
                        "        border-top-color: currentColor;\n" +
                        "        border-right-color: currentColor;\n" +
                        "        z-index: -1;\n" +
                        "    }\n" +
                        "\n" +
                        "    .warning::after {\n" +
                        "        border-bottom-color: currentColor;\n" +
                        "        border-left-color: currentColor;\n" +
                        "        box-shadow: 0.3em 0.3em 0.3em rgba(20%, 20%, 20%, 0.8);\n" +
                        "    }\n" +
                        "\n" +
                        "    @keyframes rotating {\n" +
                        "        to {\n" +
                        "            transform: rotate(360deg);\n" +
                        "        }\n" +
                        "    }\n" +
                        "</style>\n" +
                        "<a class=\"warning\" href=\"https://www.bilibili.com/\">错误：请先登录</a>");
    }


    @Test
    void sendHTMLAndFileEmail()
    {
        String photo = "<img src=\"https://i0.hdslb.com/bfs/archive/5f2762fb266c106c2a02024e4dcdf5b166d66524.jpg@672w_378h_1c\" alt=\"图片\">";

        String photo2 = "<img src=\"https://i1.hdslb.com/bfs/archive/41f6c69130a3159cb17df861e41d92b1a82e6186.png@672w_378h_1c.webp\" alt=\"图片\">";


        String photo3 = "<img src=\"https://i2.hdslb.com/bfs/archive/4a5654d75ae4731fe5ccf4108c3e191fc64fc1a3.jpg@672w_378h_1c\" alt=\"图片\">";
        String photo4 = "<img src=\"https://i1.hdslb.com/bfs/archive/a78afc181bb51d26ba76fb56db6fde46b19f52bc.jpg@672w_378h_1c.webp\" alt=\"图片\">";


        File file = new File("src/main/java/mao/spring_boot_integration_javamail/service/EmailService.java");

        emailService.sendHTMLAndFileEmail("(隔壁老王)", "",
                "java邮件API测试-包含附件",
                "HTML页面测试-包含附件，你好，世界。hello world，链接：<a href=\"https://www.bilibili.com/\">b站</a><br><br>图片："
                        + photo + "<br><br>" + photo2 + "<br><br>" + photo3 + "<br><br>" + photo4, "源码接口.java", file);

    }


    @Test
    void sendHTMLAndFileEmail1()
    {
        String photo = "<img src=\"https://i0.hdslb.com/bfs/archive/5f2762fb266c106c2a02024e4dcdf5b166d66524.jpg@672w_378h_1c\" alt=\"图片\">";

        String photo2 = "<img src=\"https://i1.hdslb.com/bfs/archive/41f6c69130a3159cb17df861e41d92b1a82e6186.png@672w_378h_1c.webp\" alt=\"图片\">";


        String photo3 = "<img src=\"https://i2.hdslb.com/bfs/archive/4a5654d75ae4731fe5ccf4108c3e191fc64fc1a3.jpg@672w_378h_1c\" alt=\"图片\">";
        String photo4 = "<img src=\"https://i1.hdslb.com/bfs/archive/a78afc181bb51d26ba76fb56db6fde46b19f52bc.jpg@672w_378h_1c.webp\" alt=\"图片\">";


        Map<String, File> fileList = new HashMap<>();
        File file1 = new File("src/main/java/mao/spring_boot_integration_javamail/service/EmailService.java");
        fileList.put("源码接口.java", file1);
        File file2 = new File("src/main/java/mao/spring_boot_integration_javamail/SpringBootIntegrationJavaMailApplication.java");
        fileList.put("程序启动类.java", file2);
        File file3 = new File("src/main/resources/static/error.html");
        fileList.put("错误页面.html", file3);


        emailService.sendHTMLAndFileEmail("(隔壁老王)", "",
                "java邮件API测试-包含多附件",
                "<h1>HTML页面测试-包含多附件</h1>，你好，世界。hello world，链接：<a href=\"https://www.bilibili.com/\">b站</a><br><br>图片："
                        + photo + "<br><br>" + photo2 + "<br><br>" + photo3 + "<br><br>" + photo4, fileList);

    }

    @Test
    void sendHTMLAndFileEmail2()
    {
        String photo = "<img src=\"https://i0.hdslb.com/bfs/archive/5f2762fb266c106c2a02024e4dcdf5b166d66524.jpg@672w_378h_1c\" alt=\"图片\">";

        String photo2 = "<img src=\"https://i1.hdslb.com/bfs/archive/41f6c69130a3159cb17df861e41d92b1a82e6186.png@672w_378h_1c.webp\" alt=\"图片\">";

        String photo3 = "<img src=\"https://i2.hdslb.com/bfs/archive/4a5654d75ae4731fe5ccf4108c3e191fc64fc1a3.jpg@672w_378h_1c\" alt=\"图片\">";
        String photo4 = "<img src=\"https://i1.hdslb.com/bfs/archive/a78afc181bb51d26ba76fb56db6fde46b19f52bc.jpg@672w_378h_1c.webp\" alt=\"图片\">";


        Map<String, File> fileList = new HashMap<>();
        File file1 = new File("src/main/java/mao/spring_boot_integration_javamail/service/EmailService.java");
        fileList.put("源码接口.java", file1);
        File file2 = new File("src/main/java/mao/spring_boot_integration_javamail/SpringBootIntegrationJavaMailApplication.java");
        fileList.put("程序启动类.java", file2);
        File file3 = new File("src/main/resources/static/error.html");
        fileList.put("错误页面.html", file3);


        emailService.sendHTMLAndFileEmail("(隔壁老王)",
                new String[]{"", "", "", "", ""},
                "java邮件API测试-包含多附件-群发",
                "<h1>HTML页面测试-包含多附件-群发</h1>，你好，世界。hello world，" +
                        "链接：<a href=\"https://www.bilibili.com/\">b站</a><br><br>图片：<br>"
                        + photo + "<br><br>" + photo2 + "<br><br>" + photo3 + "<br><br>" + photo4, fileList);

    }
}