/**
 * Copyright (C), 2015-2019, 航天广信有限公司
 * FileName: HelloController
 * Author:   cheny
 * Date:     2019/3/7 11:10
 * Description: 测试框架整合结果
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试框架整合结果〉
 *
 * @author cheny
 * @create 2019/3/7
 * @since 1.0.0
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("greeting","hello world!");
        return "hello";
    }
}
