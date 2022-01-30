package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");

        Employee obj = (Employee) context.getBean ("employee");
        obj.getId ();
        obj.getFirstName ();
        obj.getLastName ();
        obj.getAddress ();


    }
}
