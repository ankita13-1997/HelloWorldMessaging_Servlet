package com.bridgelabz.helloworld;

import com.bridgelabz.helloworld.controller.HelloRestController;
import com.bridgelabz.helloworld.controller.HelloWebController;
import com.bridgelabz.helloworld.demo.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("Hello welcome to spring");
        ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println("Demo Bean Class is - " + demoBean.toString());
        System.out.println("Web Controller class is - " + context.getBean(HelloWebController.class));
        System.out.println("Rest Controller class is - " + context.getBean(HelloRestController.class));

    }

}
