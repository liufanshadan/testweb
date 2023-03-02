package com.example.testweb.test;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@BindingType(value = SOAPBinding.SOAP12HTTP_BINDING)
@WebService(targetNamespace="http://test.testweb.example.com/",endpointInterface = "com.example.testweb.test.WsTestService")
public class WsTestServiceImpl implements WsTestService {
    private  Person person = new Person();



    @Override
    public Integer getAgeByName(String name) {
        return 18;
    }


}
