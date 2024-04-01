import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapperBuilder;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author CunNan
 * @Description freemarker 测试类
 */
public class FreeMarkerTest {

    @Test
    public void test() throws IOException, TemplateException {
        // new 出 Configuration 对象，参数为 FreeMarker 版本号
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);

        // 指定模板文件所在的路径
        configuration.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));

        // 设置模板文件使用的字符集
        configuration.setDefaultEncoding("utf-8");

        // 不适用逗号分割
        configuration.setNumberFormat("0.######");

        // 加载模板文件，创建模板对象
        Template template = configuration.getTemplate("myweb.html.ftl");

        // 创建数据模型
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("currentYear", 2024);
        List<Map<String, Object>> menuItems = new ArrayList<>();

        Map<String, Object> menuItem1 = new HashMap<>();
        menuItem1.put("url", "https://blog.cunnan.top");
        menuItem1.put("label", "CunNan Blog");

        Map<String, Object> menuItem2 = new HashMap<>();
        menuItem2.put("url", "https://www.5gy55.com");
        menuItem2.put("label", "5G资讯");

        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        dataModel.put("menuItems", menuItems);

        // 创建输出文件
        Writer out = new FileWriter("myweb.html");

        // 使用模板对象的 process 方法将模板文件输出到指定的 Writer 对象中
        template.process(dataModel, out);

        // 关闭 Writer 对象
        out.close();

    }

}

