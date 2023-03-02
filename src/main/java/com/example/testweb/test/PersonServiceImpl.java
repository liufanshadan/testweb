package com.example.testweb.test;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@BindingType(value = SOAPBinding.SOAP12HTTP_BINDING)
@WebService(targetNamespace="http://test.testweb.example.com/",endpointInterface = "com.example.testweb.test.PersonService")
public class PersonServiceImpl implements PersonService {
    private  Person person = new Person();
    @Override
    public Person createPerson(String name,int age){
        person.setName(name);
        person.setAge(age);
        return person;
    }


    @Override
    public Integer getAgeByName(String name) {
        return 18;
    }

    @Override
    public Person getPersonByName(String name) {
        Person person = new Person();
        person.setName("liufan");
        person.setAge(18);
        return person;
    }

    @Override
    public List<Person> getAllPersons() {
        Person person1 = new Person();
        person1.setName("liufan");
        person1.setAge(18);
        Person person2 = new Person();
        person2.setName("liukang");
        person2.setAge(5);
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        return list;
    }
}
