package com.sunglowsys.domain;

import java.util.Objects;

public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String address;

    public void getId() {
        System.out.println ("id"+id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void getFirstName() {
        System.out.println ("firstName"+firstName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void getLastName() {
        System.out.println ("lastName"+lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getAddress() {
        System.out.println ("address"+address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Employee employee = (Employee) o;
        return Objects.equals (id, employee.id) && Objects.equals (firstName, employee.firstName) && Objects.equals (lastName, employee.lastName) && Objects.equals (address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash (id, firstName, lastName, address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}