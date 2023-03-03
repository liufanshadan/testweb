package com.example.testweb.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public interface PersonService {
    @WebMethod
    Integer getAgeByName(@WebParam(name = "name") String name);

    @WebMethod
    Person getPersonByName(@WebParam(name = "name")String name);

    @WebMethod
    List<Person> getAllPersons();


    @WebMethod
    Person createPerson(@WebParam(name = "name")String name,@WebParam(name = "age")int age);

}
