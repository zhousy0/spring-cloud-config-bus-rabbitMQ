package io.ymq.example.eureka.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {
    @Value("${content}")
    String content;

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "Hello world ,port:" + port+",content="+content;
    }
}
