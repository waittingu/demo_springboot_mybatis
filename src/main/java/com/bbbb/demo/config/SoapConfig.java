//package com.bbbb.demo.config;
//
//import com.bbbb.demo.service.UserService;
//import org.apache.cxf.Bus;
//import org.apache.cxf.jaxws.EndpointImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.xml.ws.Endpoint;
//
//@Configuration
//public class SoapConfig {
//
//    @Autowired
//    private Bus bus;
//
//    @Autowired
//    UserService service;
//
//    /*jax-ws*/
//    @Bean
//    public Endpoint endpoint() {
//        EndpointImpl endpoint = new EndpointImpl(bus, service);
//        endpoint.publish("/UserService");
//        return endpoint;
//    }
//
//}