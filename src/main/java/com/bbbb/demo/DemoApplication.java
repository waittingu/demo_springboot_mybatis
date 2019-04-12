package com.bbbb.demo;

import com.bbbb.demo.service.UserServiceImpl;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.context.annotation.Bean;

import javax.xml.ws.Endpoint;

@SpringBootApplication
@MapperScan("com.bbbb.demo.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        JAXRSServerFactoryBean service = new JAXRSServerFactoryBean();
//        service.setResourceClasses(UserServiceImpl.class);
//        service.setServiceBean(new UserServiceImpl());
//        service.setAddress("http://127.0.0.1:12345/user");
//        service.create();
        System.out.println("程序已经启动");

    }



    // 配置一个对象与json转换的工具
    @Bean
    public JacksonJaxbJsonProvider jacksonJaxbJsonProvider() {
        return new JacksonJaxbJsonProvider();
    }

}
