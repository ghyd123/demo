package cn.itcast;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: freemarker
 * @description: TODO
 * @author: Mr.Yan
 * @create: 2019-02-03 16:51
 **/
public class Ha {

    public static void main(String[] args) throws IOException, TemplateException {


        //1.创建配置类
        Configuration configuration=new Configuration();
//2.设置模板所在的目录
        configuration.setDirectoryForTemplateLoading(new File("D:"));
//3.设置字符集
        configuration.setDefaultEncoding("utf-8");
//4.加载模板
        Template template = configuration.getTemplate("text.ftl");
//5.创建数据模型
        Map map=new HashMap();
        map.put("name", "张三 ");
        map.put("message", "欢迎来到神奇的品优购世界！");
//6.创建Writer对象
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("d://test.html")),"UTF-8"));
//7.输出
        template.process(map, out);
//8.关闭Writer对象
        out.close();
    }


}
