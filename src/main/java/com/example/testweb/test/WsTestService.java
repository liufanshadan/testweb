package com.example.testweb.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface WsTestService {
    @WebMethod
    Integer getAgeByName(@WebParam(name = "name") String name);



}
