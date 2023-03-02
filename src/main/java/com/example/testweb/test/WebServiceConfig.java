package com.example.testweb.test;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
@Configuration
public class WebServiceConfig {
    @Bean
    public ServletRegistrationBean cxfServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/message/*");//发布服务名称
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus()
    {
        return  new SpringBus();
    }

    @Bean
    public PersonService personService()
    {
        return  new PersonServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint=new EndpointImpl(springBus(),personService());//绑定要发布的服务
        endpoint.publish("/service"); //显示要发布的名称
        return endpoint;
    }
}
