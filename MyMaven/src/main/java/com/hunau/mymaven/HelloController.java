package com.hunau.mymaven;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Auther: tianyuxiao
 * @Date: 2019/9/28
 * @Description: com.hunau.mymaven
 * @version: 1.0
 */


@RestController
public class HelloController {
    @GetMapping("/sayhello")
    public String sayhello() {
        return "我叫田雨霄，家庭地址：河北省张家口市";
    }
}