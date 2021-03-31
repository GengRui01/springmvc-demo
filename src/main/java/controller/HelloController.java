package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description HelloController层
 * @Author GengRui
 * @Date 2021/3/31 11:37
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        // Model 封装数据
        model.addAttribute("msg","HELLO MY FIRST SPRING MVC PROJECT");

        // 返回的字符串就是视图的名字 会被视图解析器处理
        return "hello";
    }
}
