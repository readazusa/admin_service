package net.sunmingchun.test;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 念梓  on 2016/9/28.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class FreemarkerTest {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        try {
            String path = FreemarkerTest.class.getClassLoader().getResource("freemarker").getFile();
            System.out.println("path: "+ path);
            File file = new File(path);
            configuration.setDirectoryForTemplateLoading(file);
            Template template = configuration.getTemplate("one.ftl");
            Map<String,Object> map = new HashMap<>();
            String[] users = new String[]{"孙明春","汤圆"};
            map.put("usero","孙明春");
            map.put("users",users);
            Writer writer = new PrintWriter(System.out);
            template.process(map,writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
