package First.Controller;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Date: 2019/5/29 14:32
 * Version: 1.0
 * Author: zhaoCong
 * Description:
 */

@RestController
@SpringBootApplication
public class HelloController extends SpringBootServletInitializer {

    @RequestMapping("hello")
    String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    }